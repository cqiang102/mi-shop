package cn.lacia.mi.shop.test.service;

import cn.lacia.mi.shop.domain.GoodsType;
import cn.lacia.mi.shop.service.GoodsService;
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
public class GoodsServiceTests {

    @Autowired
    private GoodsService goodsService;
    @Test
    void testFindGoodsWithName() {
        log.info("{}",goodsService.findGoodsWithName("小米"));
    }

}
