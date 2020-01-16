package cn.lacia.mi.shop.domain;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "xiaomi.goods_order")
public class GoodsOrder implements Serializable {
    /**
     * 订单编号
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 下单时间
     */
    @Column(name = "order_date")
    private Date orderDate;

    /**
     * 所属用户
     */
    @Column(name = "consumer_id")
    private Integer consumerId;

    /**
     * 订单状态(待付款|已付款|已发货|已收货)
     */
    @Column(name = "`status`")
    private String status;

    /**
     * 收货地址
     */
    @Column(name = "goods_shipping_address_id")
    private Integer goodsShippingAddressId;

    private static final long serialVersionUID = 1L;
}