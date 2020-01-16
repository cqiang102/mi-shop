package cn.lacia.mi.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.GoodsOrderItemMapper;
import cn.lacia.mi.shop.service.GoodsOrderItemService;
/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Service
public class GoodsOrderItemServiceImpl implements GoodsOrderItemService{

    @Resource
    private GoodsOrderItemMapper goodsOrderItemMapper;

}
