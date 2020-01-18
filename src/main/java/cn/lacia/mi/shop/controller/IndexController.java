package cn.lacia.mi.shop.controller;

import cn.lacia.mi.shop.domain.Goods;
import cn.lacia.mi.shop.domain.GoodsType;
import cn.lacia.mi.shop.service.GoodsService;
import cn.lacia.mi.shop.service.GoodsTypeService;
import cn.lacia.mi.shop.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 你是电脑
 * @create 2020/1/17 - 17:44
 */
@RestController
public class IndexController {

    @Resource
    private GoodsTypeService goodsTypeService;
    @Resource
    private GoodsService goodsService;

    @GetMapping("initIndex")
    public Result initIndex(){
        List<GoodsType> topLevel = goodsTypeService.findTopLevel();
        if (topLevel.isEmpty()) {
            return Result.notOk();
        }
        Map<Integer,List<Goods>> goodsMap = new HashMap<>(8);
        topLevel.forEach(goodsType -> goodsTypeService.findSecondLevel(goodsType).forEach(secondGoodsType -> {
            goodsMap.put(secondGoodsType.getId(),goodsService.findGoodsWithType(secondGoodsType));
        }));
        Map<String,Object> data = new HashMap<String,Object>(8){{
            put("topLevel",topLevel);
            put("goodsMap",goodsMap);
        }};
        return Result.ok(data);
    }

    @GetMapping("search/{name}")
    public Result search(@PathVariable String name){
        return Result.ok(goodsService.findGoodsWithName(name));
    }

}
