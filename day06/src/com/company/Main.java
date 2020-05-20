package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String 类 Java.lang包下
        String s1 = "abc";
        System.out.println(s1);
        String s2 = "abc";
        System.out.println(s2);
        s1 += "d";
        System.out.println(s1);
        //上面abc的创建 相当于 new String 传入 char 型数组
        char data[] = {'a','b','c'};
        String str = new String(data); //String底层是字符数组实现的
        System.out.println(data);
//        String abc = new String("abc");
//        System.out.println(abc);
    }
}
