package com.company;

import java.util.Random;

/**
 * @author lbf
 * @date 2020/4/19 20:54
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //求数组中最大的值
//        Random random = new Random();
//        //创建一个12个元素的随机数组，值在1~100之间；
//        int[] arr = new int[12];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100) + 1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
        //求arr中最大的值
        //定义最大值变量max，假设是第一个
        //遍历取出，如果比max值大，更新max的值
        //输出最大值
        Random random = new Random();
        int[] arr = new int[12];
        int max = arr[0];
       a: for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;
            if (max < arr[i]) {
                max = arr[i];
            }
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i]+ " \t");
                continue a;
            }

        }
        System.out.println(" ");
        System.out.println(max);
    }
}
//        int[] arr = {5, 15, 2000, 10000, 100, 4000};
//        //定义变量，保存数组中0索引的元素
//        int max = arr[0];
//        //遍历数组，取出每个元素
//        for (int i = 0; i < arr.length; i++) {
//            //遍历到的元素和变量max比较
//            //如果数组元素大于max
//            if (arr[i] > max) {
//                //max记录住大值
//                max = arr[i];
//            }
//        }
//        System.out.println("数组最大值是： " + max);
//    }
//}
