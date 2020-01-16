package cn.lacia.mi.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.GoodsTypeMapper;
import cn.lacia.mi.shop.service.GoodsTypeService;
/**
@create 2020/1/16 - 17:38
@author    你是电脑
*/
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService{

    @Resource
    private GoodsTypeMapper goodsTypeMapper;

}
