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
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
        }

    }
}
