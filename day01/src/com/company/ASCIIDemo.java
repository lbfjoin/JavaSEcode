package com.company;

import org.w3c.dom.ls.LSOutput;

public class ASCIIDemo {
    public static void main(String[] args) {
//        char a = 'A';
//
//        int j = 1;
//        //a+1
//        System.out.println(a + j);
//        System.out.println("5 + 5="+5+5);

//    short s = 1;
//    s+=1;//只运算一次 并且带有强制类型转换的特点//相当于  s = (short)(s+1);
//    //s = s + 1
//        System.out.println(s);
//        自增运算
//         int a = 1;
//         int b = ++a;
////         a++是先进行赋值，在进行自增
////        ++a是先进行自增，后进行赋值
//       System.out.println(a);//2
//       System.out.println(b);//2
        int a = 1;
        int b = a++;
        System.out.println(a);//2
        System.out.println(b);//1

   }
}
