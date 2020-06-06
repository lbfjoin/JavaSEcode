package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * @author lbf
 * @date 2020/5/19 16:03
 * Array:
 * 1.toString() 返回此对象本身（他已经是一个字符串！）返回对象的字符串表示形式
 * 2.static void sort(int[] a) 对指定 int 型数组的指定范围按数字升序进行排序。
 * 3.copyOf(boolean[] original,int newlength) 复制指定的数组，截取或用false填充（如有必要），以使副本具有指定的长度。(返回一个新的数组。不影响原来的数组)
 */
public class ArraysDemoExercise {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2, 4};
        System.out.println(Arrays.toString(arr)); //把返回此对象本身，用字符串表示

        Arrays.sort(arr,1,4);//把数组arr 从索引位1-4进行排序
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);//把数组arr进行升序排序
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int[] ints = Arrays.copyOf(arr, 3); //把字符数组的前三个索引位的值复制成一个新的数组
        System.out.println(Arrays.toString(ints));
        int[] ints1 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(ints1));
    }
}
