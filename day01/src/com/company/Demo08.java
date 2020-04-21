package com.company;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/4/12 16:18
 */
public class Demo08 {
    //三目运算符
    //（关系表达式）?表达式1：表达式2；
    //先执行关系表达式，看其结果是true还是false
    //如果是true就执行表达式1.如果是false就执行表达式2
//    public static void main(String[] args) {
//        int sum = 2;
//        int num = 2;
//        boolean flag = (sum == num )? true: false;//代替了if语句判断
//        System.out.println(flag);
//        for(初始化条件1; 判断条件2; 控制条件3) {
//            循环体4;
//        for(int i = 0;i<10 ;i++){
//            System.out.println("hi");
//        }
    //求出所有的水仙花数
    //将100-999这些整数分别求立方和然后再逐一进行比较
//        int ge,shi,bai,count = 0;
//        for(int i = 100; i<= 999;i++){
//            ge = i % 10;
//            shi = i / 10 %10;
//            bai = i / 100;
//            if(i == ge*ge*ge+shi*shi*shi+bai*bai*bai){
//                System.out.println(i+"是水仙花数");
//                count++;
//            }
//        }
//        System.out.println("水仙花数共有"+count+"个");
    //求1-100之间的奇数和，以及奇数的个数

        public static void main(String[] args) {
            int sum = 0, count = 0;
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                    count++;
                }
            }

            System.out.println(sum);
            System.out.println("奇数一共有" + count + "个");
        }

    //把1-100之间的数字，按照一行6个进行输出;
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 6 != 0) {
//                System.out.print(" " + i);
//            } else {
//                System.out.println(" " + i);
//            }
//        }
//
//    }
//}
//}1.按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332.1166,8228,3773)的数字
//    2.每行输出5个满足条件的数，之间用空格分隔
//   3.如: 9999 9988 9977 9966 9955
//    public static void main(String[] args) {
//        int count = 0;
//        for(int i=1000;i <= 9999; i++){
//            int ge = i % 10;
//            int shi = i / 10 % 10;
//            int bai = i / 100 % 10;
//            int qian = i / 1000;
//            if (ge + bai == shi + qian){
//                count++;
//                if (count % 5 == 0 ) {
//                    System.out.println(" "+ i);
//                }else{
//                    System.out.print(" "+ i);
//                }
//
//            }
//        }
//    }
//从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和,要求如下:
//    1.数字的个位数不为7;
//    2.数字的十位数不为5;
//    3.数字的百位数不为3;
//    public static void main(String[] args) {
//        System.out.println("请输入一个大于100的三位数");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int ge = num % 10;
//        int shi = num / 10 % 10;
//        int bai = num / 100;
//        int sum = 0;
//        int count =0;
//        for (int i = 101; i <= num;i++){
//            count++;
//            if (ge != 7 && shi != 5 && bai != 3){
//                sum = sum + i;
//                System.out.println(sum);
//            }
//
//        }
//        System.out.println("这样的数有"+ count+"个");
//
//    }
//
//      whlie循环
//            while(循环条件){
//                循环体；
//            }
//       int i= 0;
//       while (i < 10){
//           System.out.println("hi");
//           i++;
//       }
    //do while 循环
//        int i = 1;
//        do{
//            System.out.println("hi");
//            i++;
//        }while(i<=10);
    //死循环
//        for(;;){
//            System.out.println("666");
//        }
//        while(true){
//            System.out.println(666);
//        }
//        do{
//            System.out.println(666);
//        }while(true);

}


