package cn.lacia.mi.shop.controller;

import cn.lacia.mi.shop.domain.Consumer;
import cn.lacia.mi.shop.service.ConsumerService;
import cn.lacia.mi.shop.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 你是电脑
 * @create 2020/1/16 - 18:24
 */
@RestController
@RequestMapping("consumer")
@Slf4j
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @PostMapping("login/auth")
    public Result login(@RequestParam String username,
                        @RequestParam String password){
        log.info("login >> username -> {} : password -> {}",username,password);
        Consumer result = consumerService.findConsumerWithUsernamePassword
                (Consumer.builder()
                .username(username)
                .password(password).build());
        log.info("login >> result -> {}",result);
        return result == null ? Result.notOk("登录失败") : Result.ok("登录成功",result);
    }
}
