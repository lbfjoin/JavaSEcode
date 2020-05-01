package com.company;

/**
 * @author lbf
 * @date 2020/4/26 14:50
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //两个变量指向同一个数组
        //定义数组
        int[] arr = new int[3];
        //对数组进行赋值操作
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 6;
        }
        //赋值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //定义数字组变量 arr2,将arr的地址赋值给arr2
        int[] arr2 = arr;
        //修改arr2的第二个元素为8
        arr2[1] = 8;
        System.out.println(arr[1]);
        //数组越界 两种可能；1.数组下标越界  2.数组中没有空间
     //   System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        //数组的空指针异常
        //意味着arr将不会保存数组的地址，也就是不允许再操作数组了
//        arr = null;//NuLLpointerException
//        System.out.println(arr[0]);
        //数组的遍历
        //遍历arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
