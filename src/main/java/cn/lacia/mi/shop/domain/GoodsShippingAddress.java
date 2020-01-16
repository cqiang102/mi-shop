package cn.lacia.mi.shop.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "xiaomi.goods_shipping_address")
public class GoodsShippingAddress implements Serializable {
    /**
     * 地址编号
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 收货人姓名
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 收货人联系方式
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 收货人电子邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 省区
     */
    @Column(name = "province")
    private String province;

    /**
     * 市区
     */
    @Column(name = "city")
    private String city;

    /**
     * 县区
     */
    @Column(name = "country")
    private String country;

    /**
     * 街道
     */
    @Column(name = "street")
    private String street;

    /**
     * 描述
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 所属用户
     */
    @Column(name = "consumer_id")
    private Integer consumerId;

    private static final long serialVersionUID = 1L;
}