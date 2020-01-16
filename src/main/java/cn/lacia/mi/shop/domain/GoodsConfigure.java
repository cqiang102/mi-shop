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
@Table(name = "xiaomi.goods_configure")
public class GoodsConfigure implements Serializable {
    /**
     * 配置编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 配置描述
     */
    @Column(name = "info")
    private String info;

    /**
     * 所属商品
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    private static final long serialVersionUID = 1L;
}