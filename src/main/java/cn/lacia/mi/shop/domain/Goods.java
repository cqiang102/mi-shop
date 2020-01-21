package cn.lacia.mi.shop.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
@create 2020/1/16 - 17:37
@author    你是电脑
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "xiaomi.goods")
@ToString
public class Goods implements Serializable {
    /**
     * 商品编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 商品名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 商品单价
     */
    @Column(name = "price")
    private Double price;

    /**
     * 商品库存
     */
    @Column(name = "stock")
    private Integer stock;

    /**
     * 商品类型
     */
    @Column(name = "goods_type_id")
    private Integer goodsTypeId;

    /**
     * 商品描述
     */
    @Column(name = "remark")
    private String remark;

    private List<GoodsImages> goodsImages;

    private static final long serialVersionUID = 1L;
}
