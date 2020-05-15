package com.company;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/5/14 23:06
 */
public class Test01Scanner01 {
    //    键盘录入三个数据并取最大值 用三目运算符
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入三个数");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        int temp = num1 > num2 ? num1 : num2;
//        int max = temp > num3 ? temp : num3;
//        System.out.println(max);
//    }
    //匿名对象 优点：简介  缺点：得创造多个对象 造成浪费
    public static void main(String[] args) {
        System.out.println("输入一个数");
        System.out.println(new Scanner(System.in).nextInt());
    }
}
