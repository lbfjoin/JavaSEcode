package com.company.duck;

/**
 * @author lbf
 * @date 2020/7/23 14:50
 */
public class Test {
    public static void main(String[] args) {
        Duck d = new Duck("鸭子","发烧",2,"感冒");
        d.showMsg();
        d.showSymptom();
    }
}
