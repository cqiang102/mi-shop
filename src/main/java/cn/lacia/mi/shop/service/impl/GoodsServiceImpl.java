package cn.lacia.mi.shop.service.impl;

import cn.lacia.mi.shop.domain.Goods;
import cn.lacia.mi.shop.domain.GoodsType;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.GoodsMapper;
import cn.lacia.mi.shop.service.GoodsService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Service
public class GoodsServiceImpl implements GoodsService{

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findGoodsWithType(GoodsType type) {
        return goodsMapper.select(Goods.builder().goodsTypeId(type.getId()).build());
    }
}
