package com.company;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/5/10 16:29
 */
public class Test01Scanner {
    //例题1.键盘输入两个数据并求和
/*    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("请输入第一个数");
//        int num1 = s.nextInt();
//        System.out.println("请输入第二个数");
//        int num2 = s.nextInt();
//        System.out.println("和为" + (num1 +num2));
//
   }*/
//    //2.键盘录入三个数据并取最大值
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("请输入第一个数");
//        int num1 = s.nextInt();
//        System.out.println("请输入第二个数");
//        int num2 = s.nextInt();
//        System.out.println("请输入第三个数");
//        int num3 = s.nextInt();
//        //方法一：
//        if (num1 > num2) {
//            if (num2 > num3) {
//                System.out.println("最大值为" + num1);
//            }
//            if (num1 < num3) {
//                System.out.println("最大值为" + num3);
//            }
//        } else if (num1 < num2) {
//            if (num2 > num3) {
//                System.out.println("最大值为" + num2);
//            } else {
//                System.out.println("最大值为" + num3);
//            }
//        }
//        //方法二：
////        int temp = (num1 > num2 ? num1 : num2);
////        int max = (temp > num3 ? temp : num3);
////        System.out.println(max);
//    }
//    //匿名对象.（没有名的对象） 只创建对象语句，没有把对象地址值赋值给某个变量
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        //这就是匿名对象的创建   优点：简洁
        System.out.println(new Scanner(System.in).nextInt());
        //匿名对象的缺点，一旦调用两次成员方法，就创建了两个对象，造成了浪费
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();
    }
}
