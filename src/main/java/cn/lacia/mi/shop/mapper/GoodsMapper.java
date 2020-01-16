package cn.lacia.mi.shop.mapper;

import cn.lacia.mi.shop.domain.Goods;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.MyMapper;

/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Mapper
public interface GoodsMapper extends MyMapper<Goods> {
}