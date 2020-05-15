package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/5/10 19:37
 */
public class Test01ArrayList {
    public static void main(String[] args) {
        //生成十个 1-33之间的随机整数，添加到集合中并且遍历输出
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(33) + 1;
            list.add(i);
        }
//        for (int i = 0; i < list.size() ; i++) {
//            System.out.print(list.get(i) + "\t");
        printArrayList(list);
    }

    //自定义方法打印 list
    public static void printArrayList(ArrayList<Integer> list) {
        //拼接左括号
        System.out.print("{");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //获取元素
            Integer num = list.get(i);
            if ( i != list.size()-1){
                System.out.print(num + ",");
            }else
            System.out.print(num);
        }
        //拼接右括号
        System.out.print("}");
    }

}

