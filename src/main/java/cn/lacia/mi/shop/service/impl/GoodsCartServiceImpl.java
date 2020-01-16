package cn.lacia.mi.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.GoodsCartMapper;
import cn.lacia.mi.shop.service.GoodsCartService;
/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Service
public class GoodsCartServiceImpl implements GoodsCartService{

    @Resource
    private GoodsCartMapper goodsCartMapper;

}
