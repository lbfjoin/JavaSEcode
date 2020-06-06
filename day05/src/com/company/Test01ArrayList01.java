package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/5/14 23:05
 */
public class Test01ArrayList01 {
    //生成十个 1-33之间的随机整数，添加到集合中并且遍历输出
    //ArrayList 作为方法被调用
//    public static void main(String[] args) {
//        Random random = new Random();
//        ArrayList<Integer> list = new ArrayList<>(10);
//        for (int i = 0; i < 10; i++) {
//            int num = random.nextInt(34) + 1;
//            list.add(num);
//            System.out.print(list.get(i) + "\t");
//        }
//        System.out.println();
//        printArrayList(list);
//    }
//
//    public static void printArrayList(ArrayList<Integer> list) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        System.out.print("{");
//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//            list1.add(integer);
//        }
//            for (int j = 0; j < list1.size(); j++) {
//                System.out.print(list1.get(j) + ",");
//                if (j == list1.size() - 1){
//                    System.out.print(list1.get(j) + "}");
//                }
//            }
//    }
    //ArrayList作为方法的返回值
//    public static void main(String[] args) {
//        ArrayList<Integer> list = getArrayList();
//        System.out.print("{");
//        for (int i = 0; i < list.size(); i++) {
//            if (i == list.size() - 1) {
//                System.out.print(list.get(i) + "}");
//            }else
//                System.out.print(list.get(i) + ",");
//
//
//        }
//    }
//
//    public static ArrayList<Integer> getArrayList() {
//        ArrayList<Integer> list = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            int num = random.nextInt(34) + 1;
//            list.add(num);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + "\t");
//        }
//        System.out.println();
//        return list;
//    }
    //生成十个 1-33之间的随机整数，添加到集合中并且遍历输出
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(34) + 1;
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            list1.add(integer);
        }
        for (int i = 0; i < list1.size(); i++) {
            list1.get(i);
            if (i == list1.size() - 1){
                System.out.print(list1.get(i) + "}");
            }
            else
                System.out.print(list1.get(i) + ",");
        }
    }
}


