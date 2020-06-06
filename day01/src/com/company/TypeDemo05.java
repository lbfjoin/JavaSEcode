package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class TypeDemo05 {
//    public static void main(String[] args) {
//        short s = 22;
//        s = (short)(s + 1);
//        System.out.println(s);
//
//    }
//    小明快要期末考试了，小明爸爸对他说，会根据他的考试成绩，送他不同的礼物.
//            假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。
//    礼物标准如下:
//
//            95~100     山地自行车一辆
//90~94      游乐场玩一次
//80~89      变形金刚玩具一个
//80以下       胖揍一顿
//
//public static void main(String[] args) {
//    System.out.println("请输入小明的分数");
//    Scanner sc = new Scanner(System.in);
//    int score = sc.nextInt();
//    if (score >= 95 && score <= 100){
//        System.out.println("奖励山地自行车一辆");
//    }else if (score >= 90 && score <= 94){
//        System.out.println("游乐场玩一次");
//    }else if (score >= 80 && score <= 89){
//        System.out.println("变形金刚玩具一个");
//    }else if (score < 80){
//        System.out.println("胖揍一顿");
//    }else {
//        System.out.println("分数不正确，请重新输入");
//    }
//
//}
//    提示用户录入3个整数, 并接收.
//            通过if语句获取这三个整数的最大值.
//            将结果打印到控制台上
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("请输入第一个数");
//    int a = sc.nextInt();
//    System.out.println("请输入第二个数");
//    int b = sc.nextInt();
//    System.out.println("请输入第三个数");
//    int c = sc.nextInt();
//    if(a>b){
//        if (a>c){
//            System.out.println("最大值"+a);
//        }else {
//            System.out.println("最大值"+c);
//        }
//    }else if (a<b){
//        if (b<c){
//            System.out.println("最大值"+c);
//        }else{
//            System.out.println("最大值"+b);
//        }
//    }
//}
//public static void main(String[] args) {
//    System.out.println("请输入月份");
//    Scanner sc = new Scanner(System.in);
//    int month = sc.nextInt();
//    switch (month){
//        case 1:
//        case 2:
//        case 12:
//            System.out.println("冬季");
//            break;
//        case 3:
//        case 4:
//        case 5:
//            System.out.println("春季");
//            break;
//        case 6:
//        case 7:
//        case 8:
//            System.out.println("夏季");
//            break;
//        case 9:
//        case 10:
//        case 11:
//            System.out.println("冬季");
//            break;
//        default:
//            System.out.println("不是月份数字");
//            break;
//
//    }
//}
//    90~100 山地自行车一辆
//80~89 游乐场玩一次
//70~79 变形金刚玩具一个
//70以下 胖揍一顿
//public static void main(String[] args) {
//    System.out.println("请输入小明的分数");
//    Scanner sc = new Scanner(System.in);
//    int score = sc.nextInt();
//    if (score >= 0 && score <= 100){
//        switch (score/10){
//            case 10:
//            case 9:
//                System.out.println("山地自行车一辆");
//                break;
//            case 8:
//                System.out.println("游乐场玩一次");
//                break;
//            case 7:
//                System.out.println("变形金刚一个");
//                break;
//            default:
//                System.out.println("胖揍一顿");
//                break;
//
//        }
//    }else{
//        System.out.println("请输入正确分数");
//    }
//
//}涨工资的条件如下：
//[10-15)     +5000
//[5-10)      +2500
//[3~5)       +1000
//[1~3)       +500
//[0~1)       +200
//打印格式如下:
//您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元

    //public static void main(String[] args) {
//    System.out.println("请输入您的工龄");
//    Scanner sc = new Scanner(System.in);
//    int years = sc.nextInt();
//    int a = 3000;
//    if (years >= 0 && years < 1){
//        System.out.println("您目前工作了"+ years +"年，基本工资为"+ a + "元，应涨工资200元，涨后工资"+ (a + 200)+"元");
//    }else if (years >= 5 && years < 10){
//        System.out.println("您目前工作了"+ years +"年，基本工资为"+ a + "元，应涨工资2500元，涨后工资"+ (a + 2500)+"元");
//    }else if (years >= 3 && years < 5 ){
//        System.out.println("您目前工作了"+ years +"年，基本工资为"+ a + "元，应涨工资1000元，涨后工资"+ (a + 1000)+"元");
//    }else if (years >= 1 && years < 3){
//        System.out.println("您目前工作了"+ years +"年，基本工资为"+ a + "元，应涨工资500元，涨后工资"+ (a + 500)+"元");
//    }else{
//        System.out.println("您目前工作了"+ years +"年，基本工资为"+ a + "元，应涨工资5000元，涨后工资"+ (a + 5000)+"元");
//
//    }
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("请输入第一个数");
//    int a = sc.nextInt();
//    System.out.println("请输入第二个数");
//    int b = sc.nextInt();
//    System.out.println("请输入运算方式");
//    int c = sc.nextInt();
//    int result;
//    switch (c){
//        case 0:
//            result = a + b;
//            System.out.println(a+ "+" + b + "=" + result );
//            break;
//        case 1:
//            result = a - b;
//            System.out.println(a+ "-" + b + "=" + result);
//            break;
//        case 2:
//            result = a * b;
//            System.out.println(a+ "*" + b + "=" + result);
//            break;
//        case 3:
//            result = a / b;
//            System.out.println(a+ "/" + b + "=" + result);
//            break;
//        default:
//            System.out.println("重新输入运算方式");
//            break;
//    }
//}
//    键盘录入一个三位数字,输出该三位数字是否是水仙花数字?
//    水仙花数字要求: 指的是一个三位数，个位、十位、百位的数字立方和等于原数
//    例如 153 3*3*3 + 5*5*5 + 1*1*1 = 27 + 125 + 1 = 153
//
//
//    实现步骤:
//            1.创建键盘录入对象
//2.获取一个int数字
//3.获取个位,十位,百位
//4.求个位,十位,百位的立方和
//5.利用if语句判断立方和是否等于该数字本身,并输出结果
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("请输入一个三位数字");
//    int num = sc.nextInt();
//    int ge = num % 10;
//    int shi = num /10 % 10;
//    int bai = num / 100;
//    if (num == ge*ge*ge + shi*shi*shi + bai*bai*bai) {
//        System.out.println(num + "是水仙花数");
//    }else{
//        System.out.println(num + "不是水仙花数");
//    }
//}
//    定义两个int类型的变量a. b, 初始化值分别为10, 20
//    通过三元运算符, 获取变量a和b的最大值.
//            将结果(最大值)打印到控制台上
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int max = a < b ? b : a;
//        System.out.println(max);
//
//    }
//    动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，请用程序实现判断两只老虎的体重是否相同。
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个老虎的体重");
//        int a = sc.nextInt();
//        System.out.println("请输入第二个老虎的体重");
//        int b = sc.nextInt();
//        boolean flag = a == b ? true:false;
//        System.out.println(flag);
//    }
//    提示用户录入第一个和尚的身高, 并接收
//            提示用户录入第二个和尚的身高, 并接收
//    提示用户录入第三个和尚的身高, 并接收.
//            通过三元运算符, 获取三个和尚中身高最高的那个和尚的身高.
//            将结果(最低身高)打印到控制台上.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个和尚的身高");
//        int height1 = sc.nextInt();
//        System.out.println("请输入第二个和尚的身高");
//        int height2 = sc.nextInt();
//        System.out.println("请输入第三个和尚的身高");
//        int height3 = sc.nextInt();
//        int max1 = height1 < height2 ? height2 :height1;
//        int max2 = max1 < height3 ? height3 : max1;
//        System.out.println("最高的和尚身高为" + max2);
//    }
//小明左、右手中分别拿两张纸牌（比如：黑桃10和红桃8，数字10和8可通过键盘录入），要求编写代码交换小明手中的牌
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入小明右手中的纸牌数");
//        int right = sc.nextInt();
//        System.out.println("请输入小明左手中的纸牌数");
//        int left = sc.nextInt();
//        System.out.println("互换之前小明手中的牌数：");
//        System.out.println("小明右手的纸牌数为"+ right);
//        System.out.println("小明左手的纸牌数为"+ left);
//        int temp;
//        temp = right;
//        right = left;
//        left = temp;
//        System.out.println("互换之前小明手中的牌数：");
//        System.out.println("小明右手的纸牌数为"+ right);
//        System.out.println("小明左手的纸牌数为"+ left);
//    }
//    public static void main(String[] args) {
//        for (int i = 5;i >= 1;i--){
//            System.out.print(i);
//        }
//        System.out.println( " ");
//        for (int i = 1;i<=5; i++){
//            System.out.print(i);
//        }
//    }
//    已知世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米).
//
//    假如我有一张足够大的纸，它的厚度是0.1毫米.
//
//            请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
//    public static void main(String[] args) {
//        int a = 8844430;
//        int count=0;
//     double b = 0.1;
//        while (b<a){
//            b*=2;
//            count++;
//        }
//        System.out.println(count);
//
//    }
    //通过do.while循环, 在控制台打印10次Hello World!
//    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println("hi");
//            i ++;
//        }while (i <= 10);
//    }
//   1. 从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和, 要求如下:
//
//    数字的个位数不为7;
//    数字的十位数不为5;
//    数字的百位数不为3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个三位数");
//        int num = sc.nextInt();
//        int ge = num % 10;
//        int shi = num /10 % 10;
//        int bai = num / 100;
//        int count = 0;
//        int sum = 0;
//        if (num>=100 && num<= 1000) {
//            if (ge != 7 && shi != 5 && bai != 3) {
//                for (int i = 100; i <= num; i++) {
//                    count++;
//                    sum += i;
//                }
//                System.out.println("一共有" + count + "数字" + ",和为" + sum);
//            }
//        }else{
//            System.out.println("请重新输入数字");
//        }
//    }
//
//    2.按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数.
    //    每行输出5个满足条件的数，之间用空格分隔
//
//    如：9999 9988 9977 9966 9955
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1000;i <=9999;i++){
//            int ge = i % 10;
//            int shi = i / 10 % 10;
//            int bai = i/ 100 % 10;
//            int qian = i / 1000 % 10;
//            if (ge + bai == shi + qian) {
//                count++;
//                if (count % 5 == 0) {
//                    System.out.println(" " + i);
//                } else {
//                    System.out.print(" " + i);
//                }
//            }
//
//        }
//        System.out.println("一共有"+count+"个数字");
//    }
//

//    3.把1-100之间的数字，按照一行6个进行输出
//public static void main(String[] args) {
//    int count = 0;
//    for (int i = 1; i <= 100; i++) {
//        count++;
//        if (count % 6 == 0) {
//            System.out.println(" " + i);
//        } else {
//            System.out.print(" " + i);
//        }
//    }
//}
//    4.求1-100之间的奇数和，以及奇数的个数
//public static void main(String[] args) {
//    int count = 0;
//    int sum = 0;
//    for (int i = 1;i<=100;i++){
//        if (i % 2 != 0){
//            count++;
//            sum = sum + i;
//
//        }
//    }System.out.println(sum);
//    System.out.println(count);
//
//}
//1. 从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和, 要求如下:
//    数字的个位数不为7;
//    数字的十位数不为5;
//    数字的百位数不为3
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("请输入一个三位数");
//    int num = sc.nextInt();
//    int count = 0;
//    int ge = num % 10;
//    int shi = num /10 % 10;
//    int bai = num /100;
//    int sum = 0;
//    if (num > 100 && num <= 999){
//        for (int i = 100;i <= num;i++){
//         if (ge != 7 && shi != 5 && bai != 3){
//             count++;
//             sum += i;
//
//         }
//        }System.out.println(count);
//        System.out.println(sum);
//
//    }else {
//        System.out.println("请输入合法数字");
//    }
//}
//     2.按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数.
//        每行输出5个满足条件的数，之间用空格分隔
//public static void main(String[] args) {
//    int count = 0;
//    for (int i= 1000;i <= 9999;i++){
//        int ge = i % 10;
//        int shi = i /10 % 10;
//        int bai = i /100 % 10;
//        int qian = i /1000 % 10;
//        if (ge + bai == shi + qian){
//            count ++;
//            if (count % 5 == 0){
//                System.out.println(" " + i);
//            }else{
//                System.out.print(" " + i);
//            }
//
//        }
//    }
//    System.out.println(count);
//}
//            3.把1-100之间的数字，按照一行6个进行输出
//public static void main(String[] args) {
//    for (int i = 1;i<= 100;i++){
//        if ( i % 6 == 0){
//            System.out.println(" " + i);
//        }else {
//            System.out.print(" " + i);
//        }
//
//    }
//}
//    4.求1-100之间的奇数和，以及奇数的个数
//public static void main(String[] args) {
// int count = 0;
// int sum = 0 ;
// for (int i = 1; i <= 100; i++){
//     if (i % 2 != 0){
//         count++;
//         sum += i;
//     }
// }
//    System.out.println(sum);
//    System.out.println(count);
//}
//public static void main(String[] args) {
//    int[] arr = new int[3];
//    arr[0] = 1;
//    arr[1] = 2;
//    arr[2] = 3;
//    System.out.println(arr[0]);
//    System.out.println(arr[1]);
//    System.out.println(arr[2]);
//}
public static void main(String[] args) {
    int[] arr = {5,15,2000,1000000,100,40000};
    int max = arr[0];
    for (int i = 0;i < arr.length;i++){
        if (max < arr[i]) {
            max = arr[i];
        }

    }    System.out.println(max);


}
}


