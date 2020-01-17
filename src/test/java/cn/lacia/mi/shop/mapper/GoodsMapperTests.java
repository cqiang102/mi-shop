package cn.lacia.mi.shop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 你是电脑
 * @create 2020/1/16 - 17:39
 */
@SpringBootTest
public class GoodsMapperTests {

    @Autowired
    private GoodsMapper goodsMapper;
    @Test
    void testSelectAll() {
        goodsMapper.selectAll().forEach(System.out::println);
    }
    @Test
    void testSelectGoodsJoinImages() {
        goodsMapper.selectGoodsJoinImages(1).forEach(System.out::println);
    }
}
