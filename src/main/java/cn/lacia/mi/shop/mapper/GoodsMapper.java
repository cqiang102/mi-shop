package cn.lacia.mi.shop.mapper;

import cn.lacia.mi.shop.domain.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Mapper
public interface GoodsMapper extends MyMapper<Goods> {

    /**
     * 根据 ID 查询全部商品和图片
     * @param id 商品id
     * @return {@link Goods}
     */
    List<Goods> selectGoodsJoinImages(Integer id);

    /**
     * 根据 名称 查询全部商品和图片
     * @param name 商品名称
     * @return {@link Goods}
     */
    List<Goods> selectGoodsJoinImagesLikeName(@Param("name") String name);
    /**
     * 根据 ID 查询单个商品和图片
     * @param id 商品id
     * @return  {@link Goods}
     */
    Goods selectOneGoodsJoinImages(Integer id);
}
