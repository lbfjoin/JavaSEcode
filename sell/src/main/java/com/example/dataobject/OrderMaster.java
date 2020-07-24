package com.example.dataobject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Time;

/**
 * @author lbf
 * @date 2020/6/21 20:38
 * dataobject中的类即是实体类
 * 他是与数据库中的表字段一一对应的类
 * 写成JavaBean模式
 */
@Entity
@Data
public class OrderMaster {
   // 订单id
   @Id
    private String orderId;
   // 买家名字
    private String buyerName;
    // 买家电话
    private int buyerPhone;
    //买家id
    private String buyerOpenId;
    // 订单总金额
    private BigDecimal orderAmount;
    // 订单状态
    private boolean orderStatus;
    //支付状态
    private boolean payStatus;
    // 创建时间
    private Time createTime;
    // 更新时间
    private Time updateTime;

}
