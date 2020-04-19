package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/4/19 18:03
 */
public class RandomDemo06 {
    //打印矩形3 x 5
    //外层负责换行，内层负责打印每一行的内容
    public static void main(String[] args) {

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //1.正三角形
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

        //2.倒三角形
//        for (int i = 0; i < 5; i++) {
//            for (int j = i; j < 5 ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

//3.99乘法表
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j+ "*" + i + "=" + i*j+"\t" );
//
//            }
//            System.out.println();
//        }


        //4.输出1-100的所有质数 3行一输出
//        int count = 0;
//        a:for (int i = 2; i < 100 ; i++) {
//            for (int j = 2; j < i ; j++) {
//                if (i % j == 0) {
//                    continue a  ;
//                }
//            }
//           System.out.print(i + (++count % 3 == 0 ? "\n":"\t" ));
//
//        }
        //带有标识的break和continue
//       a: for (int i = 1; i <= 5 ; i++) {
//           b: for (int j = 1; j <= 5 ; j++) {
//                if (j == 3 )
//                    break a;
//                System.out.print(" *");
//            }
//            System.out.println( );
//        }
        //5.10以内的五个随机数
//        Random random = new Random();
//        for (int i = 0; i < 5; i++) {
//            int num = random.nextInt(10);
//            System.out.println(num);
//        }
        //6.
//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入您的名字");
//        String name = sc.nextLine();
//        int num = random.nextInt(6);
//        switch(num){
//            case 0:
//                System.out.println("宰相");
//                break;
//            case 1:
//                System.out.println("一品带刀侍卫");
//                break;
//            case 2:
//                System.out.println("皇帝");
//                break;
//            case 3:
//                System.out.println("大内总管");
//                break;
//            case 4:
//                System.out.println("店小二");
//                break;
//            default:
//                System.out.println("江湖郎中");
//                break;
//        }

        //7.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(100) + 1;//[0,100)的随机数;
        while (true) {
            System.out.println("请输入您猜的数");
            int num = sc.nextInt();
            if (num > i) {
                System.out.println("您猜大了" + "正确的数字为" + i);
            } else if (num < i) {
                System.out.println("您猜小了" + "正确的数字为" + i);
            } else {
                System.out.println("您猜中了" + "正确的数字为" + i);
                break;
            }
        }
    }
}

