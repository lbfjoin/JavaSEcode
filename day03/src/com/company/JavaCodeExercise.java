package com.company;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/4/22 19:08
 */
public class JavaCodeExercise {
    public static void main(String[] args) {
//        打印2020年1月至2023年12月之间所有的月份, 格式为: XXXX年XX月
//        for (int i = 2020; i <= 2023 ; i++) {
//            for (int j = 1; j <= 12 ; j++) {
//                System.out.print(i + "年" + j + "月\t");
//            }
//            System.out.println( );
//        }
        //打印1天内的所有时间, 格式: 13时14分.
//        for (int i = 1; i <= 24 ; i++) {
//            for (int j = 1; j <=60 ; j++) {
//                System.out.print( i + "时" + j + "分\t");
//            }
//            System.out.println( );
//        }
//        在控制台打印一个3行5列的矩形星星序列
//        for (int i = 0; i < 3 ; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        在控制台打印一个5行5列的正三角形星星序列
//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        在控制台打印一个5行5列的倒三角形星星序列
//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = i; j <= 5 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        打印99乘法表
//        for (int i = 1; i <= 9 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j + "*" + i + "=" + i*j + "\t");
//            }
//            System.out.println();
//        }
//        打印结果是一个5行2列的矩形星星图案
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5 ; j++) {
//                if ( j == 2)
//                    break;
//                System.out.print("*");
//            }
//            System.out.println( );
//        }
//        获取一个1行2列的星星图案
//     a:   for (int i = 0; i < 5 ; i++) {
//            for (int j = 0; j < 5 ; j++) {
//                if (j == 2)
//                    break a ;
//                System.out.print("*");
//            }
//         System.out.println();
//        }
//        打印1~100之间所有的质数, 并按照3个一行的形式进行输出.
//        int count = 0;
//     a:   for (int i = 2; i <= 100; i++) {
//            for (int j = 2; j < i ; j++) {
//                if ( i % j == 0)
//                    continue a ;
//            }
//         System.out.print(++count % 3 == 0 ? i + "\n" : i+"\t");
//
//        }
//        使用Random类，生成5个10以内的随机整数, 并将结果打印到控制台
//        Random random = new Random();
//        for (int i = 0; i < 5; i++) {
//            int num = random.nextInt(10);
//            System.out.println(num);
//        }
//        提示用户录入他/她的名字并接收.
//                通过随机数, 来打印用户上辈子的职业.
//        0: 宰相, 1: 一品带刀侍卫, 2:皇帝, 3: 大内总管, 4: 店小二, 5: 江湖郎中
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入您的名字");
//        String name = scanner.nextLine();
//        int num = random.nextInt(6);
//        String work;
//        switch (num){
//            case 0:
//                work = "宰相";
//                break;
//            case 1:
//                work = "一品带刀侍卫";
//                break;
//            case 2:
//                work = "皇帝";
//                break;
//            case 3:
//                work = "大内总管";
//                break;
//            case 4:
//                work = "店小二";
//                break;
//            default:
//                work = "江湖郎中";
//                break;
//        }
//        System.out.println("您上辈子的职业是" + work + num);
//        生成一个1-100之间的随机数, 让用户来猜.
//                如果猜的数字比生成的随机数大，提示你猜的数据大了
//        如果猜的数字比生成的随机数小，提示你猜的数据小了
//        如果猜的数字与生成的随机数相等，提示恭喜你猜中了
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int ran = random.nextInt(101) + 1;
//        while (true){
//            System.out.println("请输入您猜的数");
//            int num = scanner.nextInt();
//        if (num > ran ){
//            System.out.println("您猜的数据大了" + ran);
//        }else if (num < ran){
//            System.out.println("您猜的数据小了" + ran);
//        }else  {
//                System.out.println("恭喜您猜中了" + ran);
//                break;
//            }
//        }
//        Random random = new Random(666);
//        int i = random.nextInt(10);
//        System.out.println(6);
//1.把1-100之间的数字，按照一行6个进行输出
//        int count = 0;
//        for (int i = 1; i <= 100 ; i++) {
//            if (i % 6 == 0){
//                System.out.println(i + "\t");
//            }else{
//                System.out.print(i + "\t");
//            }
//
//        }


        //    2.求1-100之间的奇数和，以及奇数的个数
//        int count = 0;
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                count++;
//                sum += i;
//            }
//        }
//        System.out.println("和为" + sum);
//        System.out.println(count + "个");

        //3. 从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和, 要求如下:
//    数字的个位数不为7;
//    数字的十位数不为5;
//    数字的百位数不为3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入大于100的三位数");
//        int num = scanner.nextInt();
//        int ge = num % 10;
//        int shi = num / 10 % 10;
//        int bai = num / 100;
//        int sum = 0;
//        int count = 0;
//        for (int i = 100; i <= num ; i++) {
//            if (ge != 7 && shi != 5 && bai != 3) {
//                count++;
//                sum += i;
//            }
//        }
//        System.out.println("和为" + sum);
//        System.out.println(count + "个");
        //     4.按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数.
//        每行输出5个满足条件的数，之间用空格分隔
//        int count = 0;
//        for (int i = 1000; i <= 9999 ; i++) {
//            int ge = i % 10;
//            int shi = i /10 % 10;
//            int bai = i /100 % 10;
//            int qian = i /1000 % 10;
//            if (ge + bai == shi + qian){
//                count++;
//                System.out.print(count % 5 == 0 ? i + "\r\n": i + "\t");
//
//            }
//
//        } System.out.println(count + "个");
        //创建一个12个元素的随机数组，值在1~100之间；
        //求arr中最大的值
        //定义最大值变量max，假设是第一个
        //遍历取出，如果比max值大，更新max的值
        //输出最大值
        Random random = new Random();
        int[] arr = new int[12];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101) + 1;
            System.out.print(arr[i]+"\t");
            if (max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println();
        System.out.println(max);


    }
}
