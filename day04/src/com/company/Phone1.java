package com.company;

/**
 * @author lbf
 * @date 2020/4/29 10:55
 */
public class Phone1 {
    String brand;
    int price;
    String color;
    public static void call(String name){
        System.out.println("给"+ name + "打电话");
    }
    public static void sendMessage(String name){
        System.out.println("给" + name + "发短信");
    }
}
