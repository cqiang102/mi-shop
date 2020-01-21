package cn.lacia.mi.shop.controller;

import cn.lacia.mi.shop.domain.Consumer;
import cn.lacia.mi.shop.domain.Goods;
import cn.lacia.mi.shop.domain.GoodsCart;
import cn.lacia.mi.shop.service.GoodsCartService;
import cn.lacia.mi.shop.service.GoodsService;
import cn.lacia.mi.shop.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 你是电脑
 * @create 2020/1/20 - 22:57
 */
@RestController
@RequestMapping("shopcart")
public class ShopCatController {
    @Resource
    private GoodsCartService goodsCartService;
    @Resource
    private GoodsService goodsService;

    @GetMapping("add/{id}")
    public Result add(@PathVariable Integer id, HttpSession session,@ModelAttribute boolean loginStatus){
        if (loginStatus) {
            return Result.notOk("请先登录");
        }
        Goods goods = goodsService.selectOneGoodsByGid(id);
        if (goods == null){
            return Result.notOk("商品不存在");
        }
        Consumer loginConsumer = (Consumer) session.getAttribute("loginConsumer");
        if (goodsCartService.addGoodsToCart(loginConsumer,goods)) {
            return Result.ok("添加购物车成功");
        }
        return Result.notOk();
    }
    @GetMapping("remove/{id}")
    public Result remove(@PathVariable Integer id, HttpSession session,@ModelAttribute boolean loginStatus){

        if (loginStatus ) {
            return Result.notOk("请先登录");
        }
        Goods goods = goodsService.selectOneGoodsByGid(id);
        if (goods == null){
            return Result.notOk("商品不存在");
        }
        Consumer loginConsumer = (Consumer) session.getAttribute("loginConsumer");
        if (goodsCartService.removeGoodsFromCart(loginConsumer,goods)) {
            return Result.ok("删除成功");
        }
        return Result.notOk();
    }
    @GetMapping("list")
    public Result findAllWithConsumer(HttpSession session,@ModelAttribute boolean loginStatus){
        if (loginStatus ) {
            return Result.notOk("请先登录");
        }
        try {
            Consumer loginConsumer = (Consumer) session.getAttribute("loginConsumer");
            List<Goods> allGoodsCartWithConsumer = goodsCartService.findAllGoodsCartWithConsumer(loginConsumer);
            return Result.ok(allGoodsCartWithConsumer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.notOk();
    }

    @ModelAttribute
    public boolean loginStatus(HttpSession session){

        Consumer loginConsumer = (Consumer) session.getAttribute("loginConsumer");
        return loginConsumer == null;


    }
}
