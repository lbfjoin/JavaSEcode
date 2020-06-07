package com.company.homework;

/**
 * @author lbf
 * @date 2020/6/7 19:07
 */
public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        System.out.println("==================");
        Universe sun = new Sun();
        sun.doAnything();

        Sun sun1 = (Sun)sun;
        sun1.shine();
    }
}
