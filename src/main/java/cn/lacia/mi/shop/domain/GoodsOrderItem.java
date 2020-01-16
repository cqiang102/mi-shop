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
@Table(name = "xiaomi.goods_order_item")
public class GoodsOrderItem implements Serializable {
    /**
     * 订单编号
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 购买商品编号
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 商品图片
     */
    @Column(name = "goods_img")
    private String goodsImg;

    /**
     * 成交金额
     */
    @Column(name = "goods_price")
    private Double goodsPrice;

    /**
     * 成交数量
     */
    @Column(name = "goods_count")
    private Integer goodsCount;

    /**
     * 小计金额
     */
    @Column(name = "goods_subtotal")
    private Double goodsSubtotal;

    /**
     * 所属订单
     */
    @Column(name = "goods_order_id")
    private String goodsOrderId;

    private static final long serialVersionUID = 1L;
}