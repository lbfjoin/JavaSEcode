package com.company;

import java.util.Random;

/**
 * @author lbf
 * @date 2020/5/7 20:49
 */
public class ExerciseCode3 {
    //数组作为方法的返回值
//    public static void main(String[] args) {
//        int[] arr = getArray();
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//    public static int[] getArray() {
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            Random random = new Random();
//            arr[i] = random.nextInt(6);
//        }
//        return arr;
//    }

    //数组作为方法的参数进行传递
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        printArray(arr);
//    }
//    public static void printArray(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
//    }
    //     * 对数组进行反转
// * {1，2，3，4，5}
// * {5，4，3，2，1}
// * 1.只要实现就行
// * 2.只创建一个数组，不创建第二个数组
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int min = 0, max = arr.length - 1; min <= max; min++, max--) {
            int temp = arr[max];
            arr[max] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
