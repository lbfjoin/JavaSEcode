package com.example.dataobject;

import javax.persistence.Id;
import java.sql.Time;

/**
 * @author lbf
 * @date 2020/6/27 11:10
 */
public class ProductInfo {
    @Id
    //商品id
    private String productId;
    //商品名字
    private String productName;
    //商品价格
    private int productPrice;
    //商品库存
    private String productStock;
    //商品描述
    private String productDescription;
    //商品图标
    private String productIcon;
    //商品状态
    private String productStatus;
    //类目编号
    private String categoryType;
    // 创建时间
    private Time createTime;
    // 更新时间
    private Time updateTime;


}
