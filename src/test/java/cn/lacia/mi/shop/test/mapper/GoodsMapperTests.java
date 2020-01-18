package cn.lacia.mi.shop.test.mapper;

import cn.lacia.mi.shop.mapper.GoodsMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 你是电脑
 * @create 2020/1/16 - 17:39
 */
@SpringBootTest
@Slf4j
@Transactional
public class GoodsMapperTests {

    @Autowired
    private GoodsMapper goodsMapper;
    @Test
    void testSelectAll() {
        goodsMapper.selectAll().forEach(goods -> log.info("{}",goods));
    }
    @Test
    void testSelectGoodsJoinImages() {
        goodsMapper.selectGoodsJoinImages(10001).forEach(goods -> log.info("{}",goods));
    }
}
