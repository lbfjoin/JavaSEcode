package com.company;

import java.util.Arrays;

/**
 * @author lbf
 * @date 2020/5/17 20:04
 * Array:
 * 1.toString() 返回此对象本身（他已经是一个字符串！）返回对象的字符串表示形式
 * 2.static void sort(int[] a) 对指定 int 型数组的指定范围按数字升序进行排序。
 * 3.copyOf(boolean[] original,int newlength) 复制指定的数组，截取或用false填充（如有必要），以使副本具有指定的长度。(返回一个新的数组。不影响原来的数组)
 *
 */
public class ArraysDemo01 {
    public static void main(String[] args) {
        // toString() 返回此对象本身（他已经是一个字符串！）
        //返回对象的字符串表示形式
        int[] arr = {3, 7, 4, 1, 18, 5};
        System.out.println(arr);  //输出的为地址
        System.out.println(Arrays.toString(arr));  //{3, 7, 4, 1, 18, 5}
        //static void sort(int[] a) 对指定 int 型数组的指定范围按数字升序进行排序。
        System.out.println("排序前" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后" + Arrays.toString(arr));

        String line = "DSAmsadsaopMIPLOK";//进行字符升序排序,并且倒序打印
        char[] array = line.toCharArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //反向遍历输出
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i] +"\t");
        }
        System.out.println("================");
        //copyOf(boolean[] original,int newlength)
        //复制指定的数组，截取或用false填充（如有必要），以使副本具有指定的长度。
        //返回一个新的数组。不影响原来的数组
        int[] ints = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(ints));

        int[] ints1 = Arrays.copyOf(arr,4 );
        System.out.println(Arrays.toString(ints1));
    }
}
