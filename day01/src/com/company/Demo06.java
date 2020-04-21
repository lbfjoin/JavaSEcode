package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Demo06 {
//    条件控制
//    单分支
//    if(要判断的条件){
//        满足条件是要执行的事情

    //    }
//    public static void main(String[] args) {
    //    定义一个时间变量time

    //        int time = 11;
//        if (time >= 11 && time <= 13) {
//            System.out.println("准备吃饭了");
//}
    //双分支
//        if (要判断的条件) {
//            满足条件时要执行的事情
//        } else {
//            不满足条件时要执行的事情
//        }
//        int time = 11;
//        if (time >= 11 && time <= 13) {
//            System.out.println("准备吃饭了");
//        else{
//            System.out.println("不能吃午饭");
    //用户在键盘输入一个整数并接收
//    public static void main(String[] args) {
//        System.out.println("请输入一个整数");
//        Scanner sc = new Scanner(System.in);
//        //在控制台中接收参数
//        int num = sc.nextInt();
//        System.out.println("您输入的整数为" + num);
//        //判断这个数时技术还是偶数，并打印
//        if (num % 2 == 0) {
//            System.out.println(num + "是偶数");
//        } else {
//            System.out.println(num + "是奇数");
//        }
//    }

    //臃肿 只有一行可以不写大括号
    //多分支
//    if（条件一{
//    }else if(条件2){
//
//    }else if(条件3){
//
//    }else （其他）{
//
//    }
//    提示用户录入[1, 7]之间的数字, 并接收.
//            根据用户录入的数字, 打印对应的星期, 格式如下:
//    用户录入1, 打印"星期一"
//    用户录入2, 打印"星期二"
//            ...以此类推
//    用户录入非法数字, 打印"没有这样的日期"
//public static void main(String[] args) {
//    System.out.println("请输入1-7的数字");
//    Scanner sc = new Scanner(System.in);
//    int day = sc.nextInt();
//    if(day == 1){
//        System.out.println("今天是星期一");
//    }
//    else if(day == 2){
//        System.out.println("今天是星期二");
//    }
//    else if(day == 3){
//        System.out.println("今天是星期三");
//    }
//    else if(day == 4){
//        System.out.println("今天是星期四");
//    }
//    else if(day == 5){
//        System.out.println("今天是星期五");
//    }
//    else if(day == 6){
//        System.out.println("今天是星期六");
//    }
//    else if(day == 7){
//        System.out.println("今天是星期日");
//    }
//    else {
//        System.out.println("请重新输入1-7数字");
//
//        }
//
//}
//    小明快要期末考试了，小明爸爸对他说，会根据他的考试成绩，送他不同的礼物.
//            假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。
//    礼物标准如下:
//            95~100 山地自行车一辆
//90~94 游乐场玩一次
//80~89 变形金刚玩具一个
//80以下 胖揍一顿
//public static void main(String[] args) {
//    System.out.println("请输入分数");
//    Scanner sc = new Scanner(System.in);
//    int score = sc.nextInt();
//    if (score >= 95 && score <= 100) {
//        System.out.println("奖励山地自行车一辆");
//    } else if (score >= 90 && score <= 94) {
//        System.out.println("奖励去游乐场玩一次");
//    } else if (score >= 80 && score <= 89) {
//        System.out.println("奖励变形金刚玩具一个");
//    } else {
//        System.out.println("胖揍一顿");
//    }
//}
//    }
//    提示用户录入3个整数, 并接收.
//            通过if语句获取这三个整数的最大值.
//            将结果打印到控制台上.
    //方法一
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请您输入第一一个数");
//        int num1 = sc.nextInt();
//        System.out.println("请您输入第二个数");
//        int num2 = sc.nextInt();
//        System.out.println("请您输入第三个数");
//        int num3 = sc.nextInt();
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("最大值为" + num1);
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("最大值为" + num2);
//        }
//        else{
//            System.out.println("最大值为" + num3);
//        }
//    }
    //方法二用If嵌套
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入第一个数");
       int a = sc.nextInt();
        System.out.println("请您输入第二个数");
        int b = sc.nextInt();
       System.out.println("请您输入第三个数");
       int c = sc.nextInt();
       int max = a;
       if(a > b){
           if(a > c){
               max = a;
           }else{
               max = c;
           }
       }
    }

}




