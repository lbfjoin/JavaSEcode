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
        ArrayList<Integer> list = getArrayList();
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
            if (i == list.size() - 1){
                System.out.print(list.get(i));
            }
        }
        System.out.print("}");
    }
    public static ArrayList<Integer> getArrayList(){
        Random random = new Random(111);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(34) + 1;
            list.add(num);
        }
        return list;
    }
}


