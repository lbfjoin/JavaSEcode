package com.company;

/**
 * @author lbf
 * @date 2020/5/17 20:53
 */
public class TestMathDemo02 {
    public static void main(String[] args) {
        //计算在-10.8 到 5.9 之间
        //绝对值大于等于6或者小于2.1的整数有多少个
        int count = 0;
        for (double i =Math.ceil(-10.8); i <= Math.ceil(5.9); i++) {
                int num = (int) Math.abs(i);
                if (num >= 6 || num < 2.1) {
                    count++;
                    System.out.print(i + "\t");
                }
            }
        System.out.println();
        System.out.println(count);


//        double min = -10.8;
//
//        double max = 5.9;
//
//        int count = 0;
//        for (double i = Math.ceil(min); i <= max ; i++) {
//            if (Math.abs(i) >= 6 || Math.abs(i) < 2.1){
//                count++;
//                System.out.print(i+ "\t");
//            }
//
//        }
//        System.out.println("共有" + count + "个");
    }
}
