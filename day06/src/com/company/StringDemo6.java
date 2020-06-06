package com.company;

/**
 * @author lbf
 * @date 2020/5/17 16:33
 */
public class StringDemo6 {
    public static void main(String[] args) {
        //定义一个方法，把数组{1，2，3} 按照指定的格式 拼接成一个字符串
//        [word1#word1#word3#]
//        int arr[] = {1, 2, 3};
//        String s = arrayToString(arr);
//        System.out.println("s:" + s);
//    }
//
//    public static String arrayToString(int[] arr) {
//        //创建字符串对象
//        String s = new String("[");
//        //遍历
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                //右面拼接[
//                s = s.concat(arr[i] + "]");
//            } else {
//                //拼接#
//                s = s.concat(arr[i] + "#");
//            }
//        }
//        return s;
        //定义一个方法，把数组{1，2，3} 按照指定的格式 拼接成一个字符串
//        [word1#word1#word3#]
        int arr[] = {1,2,3};
        String s = toStringArray(arr);
        System.out.println(s);

    }
public static String toStringArray(int[] arr){
    String s = new String("[");
    for (int i = 0; i < arr.length; i++) {
        if (i == arr.length - 1){
            s = s.concat(arr[i] + "]");
        }else {
            s = s.concat(arr[i] + "#");
        }
    }
    return s;
}
}
