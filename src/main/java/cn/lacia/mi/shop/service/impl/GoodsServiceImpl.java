package cn.lacia.mi.shop.service.impl;

import cn.lacia.mi.shop.domain.Goods;
import cn.lacia.mi.shop.domain.GoodsType;
import cn.lacia.mi.shop.mapper.GoodsTypeMapper;
import cn.lacia.mi.shop.service.GoodsTypeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.GoodsMapper;
import cn.lacia.mi.shop.service.GoodsService;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Service
public class GoodsServiceImpl implements GoodsService{

    @Resource
    private GoodsMapper goodsMapper;

    @Resource
    private GoodsTypeService goodsTypeService;

    @Override
    public List<Goods> findGoodsWithType(GoodsType type) {
        return goodsMapper.selectGoodsJoinImages(type.getId());
    }

    @Override
    public List<Goods> findGoodsWithTopType(GoodsType type) {
        List<GoodsType> goodsTypes = goodsTypeService.findSecondLevel(type);
        List<Goods> goods = new ArrayList<>();
        goodsTypes.forEach(goodsType->{
            goods.addAll(this.findGoodsWithType(goodsType));
        });
        return goods;
    }

    @Override
    public Goods selectOneGoodsByGid(Integer gid) {
        return goodsMapper.selectOneGoodsJoinImages(gid);
    }

    @Override
    public List<Goods> findGoodsWithName(String name) {
        return goodsMapper.selectGoodsJoinImagesLikeName("%"+name+"%");
    }
}
