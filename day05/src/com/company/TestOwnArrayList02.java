package com.company;

/**
 * @author lbf
 * @date 2020/5/10 21:07
 */
public class TestOwnArrayList02 {
    public static void main(String[] args) {
        OwnArrayList02 o = new OwnArrayList02(10);
        System.out.println(o.isEmpty());
        System.out.println(o.getCapacity());
        System.out.println(o.getSize());
    }
}
