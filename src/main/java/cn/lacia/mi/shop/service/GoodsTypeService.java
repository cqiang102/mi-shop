package cn.lacia.mi.shop.service;

import cn.lacia.mi.shop.domain.GoodsType;

import java.util.List;

/**
@create 2020/1/16 - 17:38
@author    你是电脑
*/
public interface GoodsTypeService{

    /**
     * 查询所有一级商品类型
     * @return 所有一级商品类型列表 {@link GoodsType}
     */
    List<GoodsType> findTopLevel();
    /**
     * 根据一级类型 查询所有二级商品类型
     * @return 二级商品类型列表 {@link GoodsType}
     */
    List<GoodsType> findSecondLevel(GoodsType goodsType);
}
