package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/5/23 17:37
 */
public class Test02ArrayList02 {
    //打印随机生成的20个数放入数组，并调用方法，将数组中的偶数另放入一个集合中
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int j = random.nextInt(20);
            list.add(j);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
        getArrayList(list);
    }
    public static void getArrayList(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer % 2 ==0){
                list1.add(integer);
            }
        }
        System.out.print("{");
        for (int i = 0; i < list1.size(); i++) {
            if (i == list1.size() - 1)
            System.out.print(list1.get(i) + "}");
            else {
                System.out.print(list1.get(i) + "\t");
            }
        }
    }
}
