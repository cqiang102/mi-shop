package cn.lacia.mi.shop.service.impl;

import cn.lacia.mi.shop.domain.Consumer;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.lacia.mi.shop.mapper.ConsumerMapper;
import cn.lacia.mi.shop.service.ConsumerService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
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
        Consumer resultConsumer = consumerMapper.selectOne(Consumer.builder()
                .username(consumer.getUsername())
                .password(consumer.getPassword()).build());
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

    @Override
    public Consumer register(Consumer consumer) {
        List<Consumer> consumers = consumerMapper
                .select(Consumer.builder()
                .username(consumer.getUsername())
                .password(consumer.getPassword()).build());
        if ( consumers != null && ! consumers.isEmpty() ) {
            return null;
        }
        else if (consumerMapper.insertSelective(consumer) <= 0){
            return null;
        }
        return consumer;
    }
}
