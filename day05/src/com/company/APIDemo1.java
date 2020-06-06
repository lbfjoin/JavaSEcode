package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/5/10 15:26
 * API application programming interface 应用程序接口
 */
public class APIDemo1 {
    //1.Scanner 类
//    public static void main(String[] args) {
//        //System.in 是指通过键盘录入数据
//        Scanner scanner = new Scanner(System.in);
//        //除了Java.Lang包下的类不需要导入，其他的必须导入才能使用
//        //导包的格式： import 包名.类名；
//        //调用方法 变量名.方法名（）；
//        int i = scanner.nextInt();
//        System.out.println(i);
//   }
    //2.Random 类
    //3.ArrayList 类
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    //创建学生对象
    String s1 = "曹操";
    String s2 = "刘备";
    String s3 = "孙权";
//打印学生ArrayList集合
System.out.println(list); //  输出的为[ ]
//把学生对象作为元素添加到集合
list.add(s1);
list.add(s2);
list.add(s3);
//打印学生ArrayList集合
System.out.println(list);
}
}



