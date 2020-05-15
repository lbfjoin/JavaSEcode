package com.company;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/5/10 16:44
 */
public class Test02Scanner {
    public static void main(String[] args) {
        //匿名对象可以作为方法的参数和返回值
        //1.作为参数
          //普通方法
//        Scanner sc = new Scanner(System.in);
//        input(sc);
//        //匿名对象作为方法的接收参数
        input(new Scanner(System.in));
    }
    public static void input(Scanner scanner){
        System.out.println(scanner);
    }
}
