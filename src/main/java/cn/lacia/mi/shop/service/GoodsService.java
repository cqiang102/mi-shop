package cn.lacia.mi.shop.service;

import cn.lacia.mi.shop.domain.Goods;
import cn.lacia.mi.shop.domain.GoodsType;

import java.util.List;

/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
public interface GoodsService{

    /**
     * 根据商品类型查询商品
     * @param type 商品类型 {@link GoodsType}
     * @return 该类型的商品 {@link Goods}
     */
    List<Goods> findGoodsWithType(GoodsType type);
}
