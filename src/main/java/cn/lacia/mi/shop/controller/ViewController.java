package cn.lacia.mi.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 你是电脑
 * @create 2020/1/17 - 16:08
 */
@Controller
public class ViewController {

    @GetMapping(value = {"","index","/","index.html"})
    public String index(){
        return "index";
    }
    @GetMapping(value = {"login","login.html"})
    public String login(){
        return "login";
    }
    @GetMapping(value = {"register","register.html"})
    public String register(){
        return "register";
    }
    @GetMapping(value = {"detail","detail.html"})
    public String detail(){
        return "detail";
    }
    @GetMapping(value = {"shopcart","shopcart.html"})
    public String shopcart(){
        return "shopcart";
    }
    @GetMapping(value = {"goodslist","goodslist.html"})
    public String goodslist(){
        return "goodslist";
    }
    @GetMapping(value = {"goodslist2","goodslist2.html"})
    public String goodslist2(){
        return "goodslist2";
    }
}
