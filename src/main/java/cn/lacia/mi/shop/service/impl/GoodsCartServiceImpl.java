package cn.lacia.mi.shop.service.impl;

import cn.lacia.mi.shop.domain.Consumer;
import cn.lacia.mi.shop.domain.Goods;
import cn.lacia.mi.shop.domain.GoodsCart;
import cn.lacia.mi.shop.mapper.GoodsMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.GoodsCartMapper;
import cn.lacia.mi.shop.service.GoodsCartService;
import org.thymeleaf.expression.Lists;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Service
public class GoodsCartServiceImpl implements GoodsCartService{

    @Resource
    private GoodsCartMapper goodsCartMapper;
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public boolean addGoodsToCart(Consumer consumer,Goods goods) {
        // TODO 购物车逻辑
        GoodsCart goodsCart = checkGoodIsInCart(consumer, goods);
        if (Objects.isNull(goodsCart)) {
            // 没有这个商品，新增这个商品

            GoodsCart build = GoodsCart.builder()
                    .addDate(new Date())
                    .buyCount(1)
                    .consumerId(consumer.getId())
                    .goodsId(goods.getId())
                    .subtotal(goods.getPrice())
                    .build();
            return goodsCartMapper.insert(build) > 0 ;
        }
        else {
            // 有这个商品，更新数量和小计金额
            int count = goodsCart.getBuyCount()+1;
            goodsCart.setSubtotal((goodsCart.getSubtotal()/goodsCart.getBuyCount()) * count);
            goodsCart.setBuyCount(count);
            return goodsCartMapper.updateByPrimaryKeySelective(goodsCart) > 0;

        }
    }

    @Override
    public boolean removeGoodsFromCart(Consumer consumer,Goods goods) {

        GoodsCart goodsCart = checkGoodIsInCart(consumer, goods);
        if (! Objects.isNull(goodsCart)) {
            goodsCartMapper.delete(goodsCart);
            return true;
        }
        return false;
    }

    @Override
    public List<Goods> findAllGoodsCartWithConsumer(Consumer consumer) {
        Example example = new Example(GoodsCart.class);
        example.createCriteria().andEqualTo("consumerId",consumer.getId());
        List<GoodsCart> goodsCarts = goodsCartMapper.selectByExample(example);
        List<Goods> goodsList = new ArrayList<>();
        goodsCarts.forEach(goodsCart -> {
            goodsList.add(goodsMapper.selectOneGoodsJoinImages(goodsCart.getGoodsId()));
        });
        return goodsList;
    }

    private GoodsCart checkGoodIsInCart(Consumer consumer,Goods goods){
        // 查找购物车中是否有这个商品
        Example example = new Example(GoodsCart.class);
        goods = goodsMapper.selectByPrimaryKey(goods.getId());
        example.createCriteria().andEqualTo("consumerId",consumer.getId()).andEqualTo("goodsId",goods.getId());
        return goodsCartMapper.selectOneByExample(example);
    }
}
