package cn.lacia.mi.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.lacia.mi.shop.mapper")
public class MiShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiShopApplication.class, args);
    }

}
