package cn.lacia.mi.shop.service.impl;

import cn.lacia.mi.shop.domain.Consumer;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.ConsumerMapper;
import cn.lacia.mi.shop.service.ConsumerService;
import tk.mybatis.mapper.entity.Example;

import java.util.Objects;

/**
@create 2020/1/16 - 17:35
@author    你是电脑
*/
@Service
public class ConsumerServiceImpl implements ConsumerService{

    @Resource
    private ConsumerMapper consumerMapper;

    @Override
    public Consumer findConsumerWithUsernamePassword(Consumer consumer) {
        Example example = new Example(Consumer.class);
        example.createCriteria()
                .andEqualTo("username",consumer.getUsername());
        Consumer resultConsumer = consumerMapper.selectOneByExample(example);
        // 用户名为空
        if (resultConsumer == null) {
            return null;
        }
        // 密码错误
        if ( ! Objects.equals(resultConsumer.getPassword(),consumer.getPassword())){
            return null;
        }
        return resultConsumer;
    }
}
