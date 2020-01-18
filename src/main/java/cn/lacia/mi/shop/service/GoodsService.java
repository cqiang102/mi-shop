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

    /**
     * 根据 商品ID 查询商品
     * @param gid 商品ID
     * @return {@link Goods}
     */
    Goods selectOneGoodsByGid(Integer gid);

    /**
     * 根据名称模糊搜索
     * @param name 商品名称
     * @return {@link Goods}
     */
    List<Goods> findGoodsWithName(String name);
}
