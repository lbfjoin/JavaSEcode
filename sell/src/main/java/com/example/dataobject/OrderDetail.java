package com.example.dataobject;

import javax.persistence.Id;
import java.sql.Time;

/**
 * @author lbf
 * @date 2020/6/27 11:04
 */
public class OrderDetail {
    @Id
    //详情Id
    private String detailId;
    //订单id
    private String orderId;
    //商品id
    private String productId;
    //商品名称
    private String productName;
    //商品价格
    private int productPrice;
    //商品数量
    private String productQuantity;
    //商品图标
    private String productIcon;
    //创建时间
    private Time createTime;
    //更新时间
    private Time updateTime;

}
