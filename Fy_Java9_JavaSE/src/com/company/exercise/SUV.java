package com.company.exercise;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/26 15:27
 */
public class SUV extends Auto {
    private static int smallStandard;
    private static int middleStandard;

    static {
        smallStandard = 4295;
        middleStandard = 5070;
    }

    public SUV() {
    }

    public SUV(String brand, int length, float price) {
        super(brand, length, price);
    }

    public boolean isSmall() {
        return getLength() < smallStandard;
    }

    public boolean isBig() {
        return getLength() > middleStandard;
    }

    public boolean isMiddle(){
        return getLength() >= smallStandard && getLength() <= middleStandard;
    }
}
