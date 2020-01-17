package cn.lacia.mi.shop.service;

import cn.lacia.mi.shop.domain.Consumer;

/**
@create 2020/1/16 - 17:35
@author    你是电脑
*/
public interface ConsumerService{

    /**
     * 根据账号密码查询消费者
     * @param consumer {@link Consumer}
     * @return 登录成功的用户信息 {@link Consumer}
     */
    Consumer findConsumerWithUsernamePassword(Consumer consumer);

    /**
     * 用户注册
     * @param consumer  {@link Consumer}
     * @return 注册成功的用户信息  {@link Consumer}
     */
    Consumer register(Consumer consumer);
}
