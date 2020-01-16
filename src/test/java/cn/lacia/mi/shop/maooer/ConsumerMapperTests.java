package cn.lacia.mi.shop.maooer;

import cn.lacia.mi.shop.domain.Consumer;
import cn.lacia.mi.shop.mapper.ConsumerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 你是电脑
 * @create 2020/1/16 - 17:39
 */
@SpringBootTest
@Transactional
public class ConsumerMapperTests {

    @Autowired
    private ConsumerMapper consumerMapper;
    @Test
    void testSelectAll() {
        consumerMapper.selectAll().forEach(System.out::println);
    }
    @Test
    void testInsert() {
        consumerMapper.insert(Consumer.builder().username("damu").password("123456").build());
    }
}
