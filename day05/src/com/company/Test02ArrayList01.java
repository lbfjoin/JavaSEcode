package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/5/15 10:02
 */
public class Test02ArrayList01 {
    //创建一个20个元素的集合，然后创建一个新的集合，筛选出偶数
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 20; i++) {
//            int num = random.nextInt(100);
//            list.add(num);
//
//        }
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i);
//        }
//        System.out.print(list );
//        System.out.println();
//        System.out.println("----------");
//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//            if ( integer % 2 == 0){
//                list1.add(integer);
//            }
//            for (int i1 = 0; i1 < list1.size(); i1++) {
//                list1.get(i1);
//            }
//        }
//        System.out.println(list1);
//
//    }
    //创建一个20个元素的集合，然后创建一个新的集合，筛选出偶数
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100);
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        System.out.println(list);
        System.out.println();

        //建立一个新的数组来承接偶数
        ArrayList<Integer> list2 = getArrayList(list);
        for (int i = 0; i < list2.size(); i++) {
//            Integer integer = list2.get(i);

        }
        System.out.print(list2);

    }

    //调用方法
    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if (num % 2 == 0) {
                list1.add(num);
            }
        }
        return list1;
    }
}
