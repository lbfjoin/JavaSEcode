package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Demo07 {
    //Switch 语句一般用于做固定值判断
//    public static void main(String[] args) {
//        switch (表达式){
//            case 值1:
//                语句体;
//            case 值2:
//                语句体;
//            case 值3:
//                语句体;
//            ...
//            default:
//                语句体;
//                break;
//        }
    //case 穿透  如果case中不写break 将出现case穿透现象，
//        也就是说不会再判断下一个case值，直接向后运行，直到遇到break,或者switch语句结束
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入分数");
//        int score = scanner.nextInt();
//        if(score >=0 && score <=100) {
//            int a = score / 10;
//            switch (a) {
//                case 0:
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                case 5:
//                case 6:
//                    System.out.println("胖揍一顿");
//                    break;
//                case 7:
//                    System.out.println("变形金刚");
//                    break;
//                case 8:
//                    System.out.println("游乐场");
//                    break;
//                case 9:
//                case 10:
//                    System.out.println("山地自行车");
//                    break;
//            }
//        }
//        else{
//            System.out.println("成绩不合法");
//
//
//        }
    //常用快捷键
    //ALT + enter 快速导包***
    //crtl+y 删除光标所在行
    //crtl+d复制上一行内容到下一行
    //ctrl+alt+l格式化
    //ctrl+/ 多行注释
    //alt+shift +上/下  将光标所在行的代码上下移动
//        根据工龄(整数)给员工涨工资(整数), 工龄和基本工资通过键盘录入
//        涨工资的条件如下：
//                [10-15) +5000
//                [5-10) +2500
//                [3~5) +1000
//                [1~3) +500
//                [0~1) +200
//        您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元
    public static void main(String[] args) {
//        System.out.println("请输入你的工龄");
//        Scanner sc = new Scanner(System.in);
//        int years = sc.nextInt();
//        int a = 3000;
//        switch (years) {
//            case 0:
//                System.out.println("您目前工作了"+ years+"年,基本工资为"+a+"元,应涨工资" + 200+"元，"+"涨后工资为"+(a+200)+"元");
//                break;
//            case 1:
//            case 2:
//                System.out.println("您目前工作了"+ years+"年,基本工资为"+a+"元,应涨工资" + 500+"元，"+"涨后工资为"+(a+500)+"元");
//                break;
//            case 3:
//            case 4:
//                System.out.println("您目前工作了"+ years+"年,基本工资为"+a+"元,应涨工资" + 1000+"元，"+"涨后工资为"+(a+1000)+"元");
//                break;
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("您目前工作了"+ years+"年,基本工资为"+a+"元,应涨工资" + 2500+"元，"+"涨后工资为"+(a+2500)+"元");
//                break;
//            default:
//                System.out.println("您目前工作了"+ years+"年,基本工资为"+a+"元,应涨工资" + 5000+"元，"+"涨后工资为"+(a+5000)+"元");
//                break;
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个整数");
//        int a = sc.nextInt();
//        System.out.println("请输入第二整数");
//        int b = sc.nextInt();
//        System.out.println("请输入您要进行的运算");
//        int num = sc.nextInt();
//        switch(num){
//            case 0:
//                System.out.println(a + b);
//                break;
//            case 1:
//                System.out.println(a - b);
//                break;
//            case 2:
//                System.out.println(a * b);
//                break;
//            case 3:
//                System.out.println(a / b);
//                break;
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数字");
//        int num = sc.nextInt();
//        int a = num % 10;
//        int b = num / 10 % 10;
//        int c = num /100 % 10;
//        int d = a*a*a+b*b*b+c*c*c;
//        if(num ==d){
//            System.out.println(num+"是水仙花数");
//            }else{
//            System.out.println(num+"不是水仙花数");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入小明左手中的纸牌");
//        int a = sc.nextInt();
//        System.out.println("请输入小明右手中的纸牌");
//        int b = sc.nextInt();
//        int c;
//        System.out.println("互换前小明手中的纸牌");
//        System.out.println("左手中的纸牌："+a);
//        System.out.println("右手中的纸牌："+b);
//        c = a;
//        a = b;
//        b = c;
//        System.out.println("互换前小明手中的纸牌");
//        System.out.println("左手中的纸牌："+a);
//        System.out.println("右手中的纸牌："+b);

    }
}


