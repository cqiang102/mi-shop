package cn.lacia.mi.shop.service.impl;

import cn.lacia.mi.shop.domain.GoodsType;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.GoodsTypeMapper;
import cn.lacia.mi.shop.service.GoodsTypeService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
@create 2020/1/16 - 17:38
@author    你是电脑
*/
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService{

    @Resource
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public List<GoodsType> findTopLevel() {
        Example example = new Example(GoodsType.class);
        example.createCriteria().andIsNull("pid");
        return goodsTypeMapper.selectByExample(example);
    }

    @Override
    public List<GoodsType> findSecondLevel(GoodsType goodsType) {
        Example example = new Example(GoodsType.class);
        example.createCriteria().andEqualTo("pid",goodsType.getId());
        return goodsTypeMapper.selectByExample(example);
    }
}
