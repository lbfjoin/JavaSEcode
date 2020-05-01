package com.company;

/**
 * @author lbf
 * @date 2020/4/29 11:00
 */
public class Test02_Phone1 {
    public static void main(String[] args) {
        Phone1 p = new Phone1();
        p.brand = "华为";
        p.color = "绿色";
        p.price = 999;
        p.call("lbf");
        p.sendMessage("lbf");
        System.out.println(p.brand);
        System.out.println(p.color);
        System.out.println(p.price);
    }
}
