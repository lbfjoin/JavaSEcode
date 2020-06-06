package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/5/22 18:12
 */
public class JavaCodeExercise7 {
    //        打印2020年1月至2023年12月之间所有的月份, 格式为: XXXX年XX月
//    public static void main(String[] args) {
//        for (int i = 2020; i < 2024 ; i++) {
//            for (int j = 1; j < 13 ; j++) {
//                System.out.print(i + "年" + j + "月\t");
//            }
//            System.out.println();
//        }
//    }
    //打印1天内的所有时间, 格式: 13时14分.
//    public static void main(String[] args) {
//        for (int i = 1; i < 25 ; i++) {
//            for (int j = 1; j < 61 ; j++) {
//                System.out.print(i + "时" + j + "分\t");
//            }
//            System.out.println();
//        }
//    }
    //        在控制台打印一个3行5列的矩形星星序列
//    public static void main(String[] args) {
//        a:
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 6; j++) {
//                if (i == 3)
//                    break a;
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    //        在控制台打印一个5行5列的正三角形星星序列
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//        在控制台打印一个5行5列的倒三角形星星序列
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = i; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//        打印99乘法表
//    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i + "=" + j*i + "\t");
//            }
//            System.out.println();
//
//        }
//    }
//        打印结果是一个5行2列的矩形星星图案
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (j == 2)
//                break ;
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//        获取一个1行2列的星星图案
//    public static void main(String[] args) {
//        a:
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (j == 2)
//                    break a;
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//        打印1~100之间所有的质数, 并按照3个一行的形式进行输出.
//    public static void main(String[] args) {
//        int count = 0;
//        a:
//        for (int i = 2; i < 101; i++){
//            for (int j = 2; j < i; j++) {
//                if ( i % j == 0)
//                    continue a;
//            }
//            System.out.print(++count % 3 == 0 ? i + "\n" : i + "\t");
//        }
//    }
//        提示用户录入他/她的名字并接收.
//                通过随机数, 来打印用户上辈子的职业.
//        0: 宰相, 1: 一品带刀侍卫, 2:皇帝, 3: 大内总管, 4: 店小二, 5: 江湖郎中
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入您的名字");
//        String name = scanner.nextLine();
//        Random random = new Random();
//        int num = random.nextInt(6);
//        String occupation = "";
//        switch (num) {
//            case 0:
//                occupation = "宰相";
//                break;
//            case 1:
//                occupation = "一品带刀侍卫";
//                break;
//            case 2:
//                occupation = "皇帝";
//                break;
//            case 3:
//                occupation = "大内总管";
//                break;
//            case 4:
//                occupation = "店小二";
//                break;
//            default:
//                occupation = "江湖郎中";
//                break;
//        }
//        System.out.println("您上辈子的职业是" + occupation);
//    }
    //        生成一个1-100之间的随机数, 让用户来猜.
//        如果猜的数字比生成的随机数大，提示你猜的数据大了
//        如果猜的数字比生成的随机数小，提示你猜的数据小了
//        如果猜的数字与生成的随机数相等，提示恭喜你猜中了
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int num = random.nextInt(101) + 1;
//        while (true) {
//            System.out.println("输入您猜的数");
//            int guess = scanner.nextInt();
//            if (guess > num)
//                System.out.println("猜大了" );
//            else if (guess < num)
//                System.out.println("猜小了" );
//            else {
//                System.out.println("猜中了");
//                break;
//            }
//        }
//    }
    //1.把1-100之间的数字，按照一行6个进行输出
//    public static void main(String[] args) {
//        for (int i = 1; i < 101; i++) {
//            System.out.print(i % 6 == 0 ? i + "\n" : i + "\t");
//        }
//    }
    //    2.求1-100之间的奇数和，以及奇数的个数
//    public static void main(String[] args) {
//        int count = 0;
//        int sum = 0;
//        for (int i = 1; i < 101; i++) {
//            if (i % 2 != 0){
//                count++;
//                sum += i;
//            }
//        }
//        System.out.println(count);
//        System.out.println(sum);
//    }
    //3. 从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和, 要求如下:
//    数字的个位数不为7;
//    数字的十位数不为5;
//    数字的百位数不为3
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个大于一百的三位数");
//        int num = scanner.nextInt();
//        int sum = 0;
//        int count = 0;
//        int ge = num % 10;
//        int shi = num / 10 % 10;
//        int bai = num / 100;
//        if (num < 100 || num > 10000) {
//            while (true) {
//                System.out.println("您输入的数字不合法，请重新输入");
//                int numAgain = scanner.nextInt();
//                num = numAgain;
//                if (num > 100 && num < 10000)
//                    break;
//            }
//        }
//        for (int i = 100; i <= num; i++) {
//            if (ge != 7 && shi != 5 && bai != 3) {
//                sum += i;
//                count++;
//            }
//
//        }
//        System.out.println(sum);
//        System.out.println(count);
//    }
    //     4.按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数.
//        每行输出5个满足条件的数，之间用空格分隔
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1000; i < 10000; i++) {
//            int ge = i % 10;
//            int shi = i / 10 % 10;
//            int bai = i / 100 % 10;
//            int qian = i / 1000 % 10;
//            if (ge + bai == shi + qian){
//                System.out.print(++count % 5 == 0 ? i + "\n" : i + "\t");
//            }
//
//        }
//        System.out.println(count);
//    }
    //创建一个12个元素的随机数组，值在1~100之间；
    //求arr中最大的值
    //定义最大值变量max，假设是第一个
    //遍历取出，如果比max值大，更新max的值
    //输出最大值
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101) +1;
            System.out.print(arr[i] + "\t");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println();
        System.out.println(max);
    }
}
