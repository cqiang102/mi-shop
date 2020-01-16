package cn.lacia.mi.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.GoodsMapper;
import cn.lacia.mi.shop.service.GoodsService;
/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Service
public class GoodsServiceImpl implements GoodsService{

    @Resource
    private GoodsMapper goodsMapper;

}
