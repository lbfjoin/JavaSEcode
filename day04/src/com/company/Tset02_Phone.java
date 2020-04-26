package com.company;

/**
 * @author lbf
 * @date 2020/4/26 19:16
 */
public class Tset02_Phone {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
//        Phone p2 = new Phone();
//        //输出成员变量
//        System.out.println( p.brand);
//        System.out.println( p.color);
//        System.out.println( p.price);
//        System.out.println("----------");

        //赋值
        p.brand = "华为nova5Pro";
        p.color = "暗夜绿";
        p.price = 3333;
        show(p);
//        p2.brand = "Apple";
//        p2.color = "暗黑";
//        p2.price = 9999;
//        //再次输出
//        System.out.println("品牌：" + p.brand);
//        System.out.println("颜色:" + p.color);
//        System.out.println("价格：" + p.price);
//        //调用打电话方法
//        p.call();
//        //调用发短信方法
//        p.message();
    }

    //对象作为参数进行传递
    public static void show(Phone phone) {
        System.out.println(phone.brand + phone.color + phone.price);
    }
}
