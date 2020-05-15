package com.company;

/**
 * @author lbf
 * @date 2020/5/3 15:48
 */
public class ExerciseCode2 {
    //数组作为方法的返回值
//    public static void main(String[] args) {
//        for (int i = 0; i < getArray().length ; i++) {
//            int[] arr = getArray();
//            System.out.print(arr[i] + "\t");
//        }
//    }
//    public static int[] getArray(){
//        int[] arr = {1,2,3,4,5};
//        return arr;
//     }
    //数组作为方法的参数进行传递
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        printArray(arr);
//    }
//    public static void printArray(int[] arr){
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]);
//        }
//
//    }
//     * 对数组进行反转
// * {1，2，3，4，5}
// * {5，4，3，2，1}
// * 1.只要实现就行
// * 2.只创建一个数组，不创建第二个数组
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int temp = 0;
//        for (int min = 0,max = arr.length - 1; min <= max ; min++,max--) {
//            temp = arr[min];
//            arr[min] = arr[max];
//            arr[max] = temp;
//        }
//        for (int i = 0; i < arr.length  ; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        int temp = 0;
//        for (int i = 0; i < arr.length / 2; i++) {
//            arr[i] = temp;
//            arr[i] = arr[arr.length - 1];
//            arr[arr.length - 1] = temp;
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]);
//        }
//    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[5];
        for (int i = 0; i < arr.length ; i++) {
            arr2[i] = arr[arr.length - 1 - i];
            System.out.print(arr2[i]);
        }
    }
}
