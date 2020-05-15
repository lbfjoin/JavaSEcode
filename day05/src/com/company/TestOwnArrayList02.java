package com.company;

/**
 * @author lbf
 * @date 2020/5/10 21:07
 */
public class TestOwnArrayList02 {
    public static void main(String[] args) {
        OwnArrayList01 list01 = new OwnArrayList01(10);
        System.out.println(list01.getCapacity());
        System.out.println(list01.getSize());
        System.out.println(list01.isEmpty());
    }
}
