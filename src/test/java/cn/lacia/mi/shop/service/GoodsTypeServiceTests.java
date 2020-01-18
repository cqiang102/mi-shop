package cn.lacia.mi.shop.service;

import cn.lacia.mi.shop.domain.Goods;
import cn.lacia.mi.shop.domain.GoodsType;
import cn.lacia.mi.shop.mapper.GoodsMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 你是电脑
 * @create 2020/1/16 - 17:39
 */
@SpringBootTest
@Slf4j
@Transactional
public class GoodsTypeServiceTests {

    @Autowired
    private GoodsTypeService goodsTypeService;
    @Test
    void testFindTopLevel() {
        log.info("{}",goodsTypeService.findTopLevel());
    }
    @Test
    void testFindSecondLevel() {
        log.info("{}",goodsTypeService.findSecondLevel(GoodsType.builder().id(101).build()));
    }

}
