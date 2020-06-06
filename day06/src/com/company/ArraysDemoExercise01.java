package com.company;

import java.util.Arrays;

/**
 * @author lbf
 * @date 2020/5/23 18:24
 * 1.toString() 返回此对象本身（他已经是一个字符串！）返回对象的字符串表示形式
 * 2.static void sort(int[] a) 对指定 int 型数组的指定范围按数字升序进行排序。
 * 3.copyOf(boolean[] original,int newlength) 复制指定的数组，截取或用false填充（如有必要），以使副本具有指定的长度。(返回一个新的数组。不影响原来的数组)
 */
public class ArraysDemoExercise01 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 1, 18, 5};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
        int[] arr1 =Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arr1));

    }
}
