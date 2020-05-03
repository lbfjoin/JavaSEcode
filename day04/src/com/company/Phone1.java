package com.company;

/**
 * @author lbf
 * @date 2020/5/3 16:03
 */
public class Phone1 {
    String brand;
    int price;
    String color;
    public void call(String name, String where){
        System.out.println("给在" + where + "的" + name + "打电话");
    }
    public void sendMessage(String name){
        System.out.println("给" + name + "打电话");
    }
}
