package cn.lacia.mi.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.GoodsConfigureMapper;
import cn.lacia.mi.shop.service.GoodsConfigureService;
/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Service
public class GoodsConfigureServiceImpl implements GoodsConfigureService{

    @Resource
    private GoodsConfigureMapper goodsConfigureMapper;

}
