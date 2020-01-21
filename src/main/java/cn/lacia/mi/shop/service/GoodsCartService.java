package cn.lacia.mi.shop.service;

import cn.lacia.mi.shop.domain.Consumer;
import cn.lacia.mi.shop.domain.Goods;
import cn.lacia.mi.shop.domain.GoodsCart;

import java.util.List;

/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
public interface GoodsCartService{

    /**
     * 把商品加入购物车
     * @param goods
     * @return
     */
    boolean addGoodsToCart(Consumer consumer,Goods goods);

    /**
     * 删除购物车中的商品
     * @param goods
     * @return
     */
    boolean removeGoodsFromCart(Consumer consumer,Goods goods);

    /**
     * 根据用户查询购物车中的商品
     * @param consumer
     * @return
     */
    List<Goods>   findAllGoodsCartWithConsumer(Consumer consumer);
}
