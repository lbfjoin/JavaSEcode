package com.company;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/5/31 19:22
 */
public class SUV extends Auto {


    public SUV() {

    }

    public SUV(String brand, int length, int price) {
        super(brand, length, price);
    }

    public ArrayList<SUV> judge() {
        ArrayList<SUV> suvs = new ArrayList<>();
        int smallLength = 4295;
        int mediumLength = 5070;
        int legth = super.getLength();
        if (legth <= smallLength)
            System.out.println("小型车:" + getBrand() + getLength() + getPrice());
        else if (legth > mediumLength)
            System.out.println("大型车:" + getBrand() + getLength() + getPrice());
        else if (legth > smallLength && legth <= mediumLength) {
            System.out.println("中型车:" + getBrand() + getLength() + getPrice());
        }return suvs;
    }
}
