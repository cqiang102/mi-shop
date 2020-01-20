package cn.lacia.mi.shop.service.impl;

import cn.lacia.mi.shop.domain.Consumer;
import cn.lacia.mi.shop.domain.Goods;
import cn.lacia.mi.shop.domain.GoodsCart;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.GoodsCartMapper;
import cn.lacia.mi.shop.service.GoodsCartService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Service
public class GoodsCartServiceImpl implements GoodsCartService{

    @Resource
    private GoodsCartMapper goodsCartMapper;

    @Override
    public boolean addGoodsToCart(Consumer consumer,Goods goods) {
        // TODO 购物车逻辑
        Example example = new Example(GoodsCart.class);
        example.createCriteria().andEqualTo("consumerId",consumer.getId()).andEqualTo("goodsId",goods.getId());
        // 判断购物车中是否有这个商品
        if (goodsCartMapper.selectByExample(example).size() > 0) {

        }
        return false;
    }

    @Override
    public boolean removeGoodsFromCart(Consumer consumer,Goods goods) {
        return false;
    }

    @Override
    public List<GoodsCart> findAllGoodsCartWithConsumer(Consumer consumer) {
        return null;
    }
}
