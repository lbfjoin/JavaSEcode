package com.company;

/**
 * @author lbf
 * @date 2020/4/26 16:21
 * 数组作为方法的参数进行传递
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
//        sayHello("lbf" );
        int[] arr = {1,3,5,7,9};
        printArray(arr);//调用方法，实际上是传递数组地址，而不是真实的值
    }

    //    public static void sayHello(String name){
//        System.out.println("hello" + name);
//    }
    //之前我们看到的方法都是基本数据类型作为参数的
    //使用数组作为方法的参数
//    public static void printArray(形参 实参){
//
//    }
//      public static void printArray(数据类型 变量值){
//
//   }
    public static void printArray(int[] arr) {
        //想要打印出数组，我们可以使用for循环遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


}
