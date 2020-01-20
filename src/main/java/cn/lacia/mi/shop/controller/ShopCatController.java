package cn.lacia.mi.shop.controller;

import cn.lacia.mi.shop.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 你是电脑
 * @create 2020/1/20 - 22:57
 */
@RestController
@RequestMapping("shopcart")
public class ShopCatController {

    @GetMapping("add/{id}")
    public Result add(@PathVariable Integer id){
        return Result.notOk();
    }
}
