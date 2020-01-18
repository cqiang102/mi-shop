package cn.lacia.mi.shop.controller;

import cn.lacia.mi.shop.domain.Goods;
import cn.lacia.mi.shop.service.GoodsService;
import cn.lacia.mi.shop.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 你是电脑
 * @create 2020/1/18 - 14:19
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @GetMapping("detail/{gid}")
    public Result detail(@PathVariable Integer gid){
        Goods goods = goodsService.selectOneGoodsByGid(gid);
        return  goods == null ? Result.notOk() : Result.ok(goods);
    }
}
