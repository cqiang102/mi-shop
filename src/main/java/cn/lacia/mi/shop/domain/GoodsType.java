package cn.lacia.mi.shop.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@create 2020/1/16 - 17:38
@author    你是电脑
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "xiaomi.goods_type")
public class GoodsType implements Serializable {
    /**
     * 商品类型编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 商品类型名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 上级类型
     */
    @Column(name = "pid")
    private Integer pid;

    private static final long serialVersionUID = 1L;
}