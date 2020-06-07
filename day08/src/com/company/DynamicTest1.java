package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lbf
 * @date 2020/6/7 16:53
 */
public class DynamicTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(122);
        list.add(1312);
        list.add(1552);
        list.add(4543);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int a = 100;
        //变成double类型 100.00
        double d = (int)99.9; // -----99
//        格式：父类类型 对象名 = new 子类对象
//        格式：子类类型 对象名 = （子类类型）new 父类对象
    }
}
