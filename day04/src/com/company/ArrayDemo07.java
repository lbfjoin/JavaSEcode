package com.company;

/**
 * @author lbf
 * @date 2020/4/26 16:53
 */
public class ArrayDemo07 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a);//1
        System.out.println(b);//2
        System.out.println("------------");
        change(a,b);
        System.out.println(a);//1
        System.out.println(b);//2
        System.out.println("------------");
        int[] arr = {1,3,5};
        System.out.println(arr[0]);//1
        System.out.println("------------");
        chang2(arr);
        System.out.println(arr[0]);//200
    }
    public static void change(int a,int b){
        a = a + b;
        b = b + a;

    }
    public static void chang2(int[] arr){
        arr[0] = 200;

    }
}
