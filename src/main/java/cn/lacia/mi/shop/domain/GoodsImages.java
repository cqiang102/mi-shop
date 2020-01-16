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
@Table(name = "xiaomi.goods_images")
public class GoodsImages implements Serializable {
    /**
     * 图片编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 图片路径
     */
    @Column(name = "`path`")
    private String path;

    /**
     * 图片主题
     */
    @Column(name = "title")
    private String title;

    /**
     * 图片描述
     */
    @Column(name = "alt")
    private String alt;

    /**
     * 所属商品
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    private static final long serialVersionUID = 1L;
}