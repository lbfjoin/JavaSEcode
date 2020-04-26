package com.company;

/**
 * @author lbf
 * @date 2020/4/26 19:14
 */
public class Phone {
    //成员变量:
    // 品牌
    String brand;
    //价格
    int price;
    //颜色
    String color;

    //成员方法:
    //给name打电话
    public void call(){
        String name = "Teacher";//局部变量
        System.out.println("给"+ name + "打电话");
    }
    //发短信
    public void message(){
        String name = "Teacher";
        System.out.println("给" + name + "发短信");

    }
}
