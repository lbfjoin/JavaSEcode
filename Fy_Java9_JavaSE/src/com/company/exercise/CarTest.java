package com.company.exercise;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/26 15:28
 */
public class CarTest {
    public static void main(String[] args) {
        SUV car1 = new SUV("福特", 4110, 82222);
        SUV car2 = new SUV("兰博基尼", 5080, 9999999);
        SUV car3 = new SUV("奔驰",4330,65645);
        car1.showMsg();
        car2.showMsg();
        car3.showMsg();

        ArrayList<SUV> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        for (int i = 0; i < list.size(); i++) {
            SUV suv = list.get(i);
            if (suv.isMiddle()){
                suv.showMsg();
            }
        }
    }
}
