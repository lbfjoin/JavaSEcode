package com.example.dataobject;

import javax.persistence.Id;
import java.sql.Time;

/**
 * @author lbf
 * @date 2020/6/27 11:10
 */
public class ProductCategory {
    @Id
    //类目id
    private String categoryId;
    //类目名字
    private String categoryName;
    //类目种类
    private String categoryType;
    // 创建时间
    private Time createTime;
    // 更新时间
    private Time updateTime;
}
