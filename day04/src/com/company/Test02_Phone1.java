package com.company;

/**
 * @author lbf
 * @date 2020/5/3 16:04
 */
public class Test02_Phone1 {
    public static void main(String[] args) {
        Phone1 phone1 = new Phone1();
        phone1.brand = "华为";
        phone1.color = "红色";
        phone1.price = 9999;
        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
        phone1.call("lbf" ,"学校");
        phone1.sendMessage("lbf");
    }
}
