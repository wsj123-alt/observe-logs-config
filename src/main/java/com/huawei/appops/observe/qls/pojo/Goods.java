package com.huawei.appops.observe.qls.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

//自动生成get、set
@Data
//jpa 与表的对应  name = "tb_goods"数据库中的表名
@Table(name = "tb_goods")
//标注为jpa的实体类
@Entity
@ApiModel("商品实体")
public class Goods {

    @ApiModelProperty("商品id")
    //主键
    @Id
    //告诉jpaid是如何生成的-自增的策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty("商品价格")
    //与db中的列名一样，不用多加注释
    private String price;

    @ApiModelProperty("商品名称")
    @Column(name = "goods_name")
    private String goodsName;

    @ApiModelProperty("商品描述")
    @Column(name = "goods_desc")
    private String goodsDesc;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", price='" + price + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                '}';
    }
}