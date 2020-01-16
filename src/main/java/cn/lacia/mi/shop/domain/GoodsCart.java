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
@Table(name = "xiaomi.goods_cart")
public class GoodsCart implements Serializable {
    /**
     * 购物编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 商品编号
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 购买数量
     */
    @Column(name = "buy_count")
    private Integer buyCount;

    /**
     * 添加时间
     */
    @Column(name = "add_date")
    private Date addDate;

    /**
     * 小计金额
     */
    @Column(name = "subtotal")
    private Double subtotal;

    /**
     * 所属用户
     */
    @Column(name = "consumer_id")
    private Integer consumerId;

    private static final long serialVersionUID = 1L;
}