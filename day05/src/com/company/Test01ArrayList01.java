package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/5/14 23:05
 */
public class Test01ArrayList01 {
    //生成十个 1-33之间的随机整数，添加到集合中并且遍历输出
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(33) + 1;
            list.add(num);

        }
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            System.out.print(integer + ",");
            if (i == list.size() - 1) {
                System.out.print(integer);
            }
        }
        System.out.print("}");

    }
}


