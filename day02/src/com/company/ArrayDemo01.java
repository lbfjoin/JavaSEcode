package com.company;

/**
 * @author lbf
 * @date 2020/4/19 20:35
 */
public class ArrayDemo01 {
    /*
    数组 定义格式：
    1.数组存储的数据类型[] 数组名；
    2. 数组存储的数据类型  数组名[];
     */
    String[] str;
    String str2[];

    public static void main(String[] args) {
        //数组的初始化
        //动态初始化：数组只给定长度，系统默认给初始化值0
        //1.数组存储的数据类型[] 数组名子 = new 数组存储的数据类型[长度]
        int[] arr = new int[5];
        System.out.println(arr);//内存地址  十六进制
        System.out.println(arr[0]);
        //静态初始化
        //数组存储的数据类型[] 数组名字 = new 数组存储的数据类型[]{值1，值2，值3，}
        int[] arr2 = new int[]{1,3,5,7,9};
        //简写形式
        int[] arr3 = {1, 4, 6, 8};
        //数组的访问  index 从0开始
        // 数组名[索引]
        System.out.println(arr3[2]);
        //长度属性， 数组名.length  表示数组中元素的个数
        System.out.println(arr3.length);
        //修改数组中的元素
        arr3[2] = 666;
        System.out.println("修改后的值" + arr3[2]);
        //数组的遍历，一个一个取出来
        for (int i = 0; i < arr3.length ; i++) {
            System.out.println(arr3[i]);

        }


    }
}
