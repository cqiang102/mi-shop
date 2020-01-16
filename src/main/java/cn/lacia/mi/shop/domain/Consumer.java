package cn.lacia.mi.shop.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@create 2020/1/16 - 17:35
@author    你是电脑
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "xiaomi.consumer")
public class Consumer implements Serializable {
    /**
     * 用户编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户账号
     */
    @Column(name = "username")
    private String username;

    /**
     * 用户密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 电子邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 联系方式
     */
    @Column(name = "phone")
    private String phone;

    private static final long serialVersionUID = 1L;
}