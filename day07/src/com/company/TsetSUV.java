package com.company;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/5/31 19:34
 */
public class TsetSUV {
    public static void main(String[] args) {
        ArrayList<SUV> list = new ArrayList<>();
        SUV car1 = new SUV("大众", 5000, 150000);
        SUV car2 = new SUV("宝马SUV", 4813, 550000);
        SUV car3 = new SUV("福特", 5080, 450000);
        SUV car4 = new SUV("奥迪SUV", 4545, 650000);
       list.add(car1);
       list.add(car2);
       list.add(car3);
       list.add(car4);
        SUV suv = new SUV();
        for (int i = 0; i < list.size(); i++) {
            SUV suv1 = list.get(i);
            System.out.println(suv1.getBrand() +":"+ suv1.getLength() +":"+ suv1.getPrice());
            suv.judge();
        }



    }
}
