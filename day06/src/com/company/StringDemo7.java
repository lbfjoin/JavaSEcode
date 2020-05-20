package com.company;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/5/17 17:08
 * * 1.equal(Object anObject)将此字符串与指定的对象比较。返回值类型boolean
 * * 2.int length() 返回此字符串的长度。 实际调用的是 底层length数组的属性
 * * 3.concat(String str) 将指定字符串连接到此字符串的结尾 和字符串拼接很像
 * * 4.charAt(int index)返回指定索引处的 char 值。
 * * 5.indexOf(String str) 返回指定子字符串在此字符串中第一次出现处的索引。
 * * 6.substring(int beginIndex, int endIndex) 返回一个新字符串，它是此字符串的一个子字符串。
 * *  转化功能的方法
 * * 7. toCharArray()将此字符串转换为一个新的字符数组
 * * 8. getBytes(String charsetName)使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
 * * 9.replace(CharSequence target, CharSequence replacement)  使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 * * 10.split(String regex) 根据给定正则表达式的匹配拆分此字符串。
 */
public class StringDemo7 {
    //键盘录入一个字符串，统计字符串中大小写字母及数字字符的个数
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] arr = s.toCharArray();
        int bigLetter = 0;
        int smallLetter = 0;
        int num = 0;
        // neusoft1Neuedu3
        for (int i = 0; i < arr.length; i++) {
            //也可以
            if (arr[i] > 'A' && arr[i] < 'Z')
                bigLetter++;
            else if (arr[i] > 'a' && arr[i] < 'z')
                smallLetter++;
            else if (arr[i] > '0' && arr[i] < '9')
                num++;
            else
                System.out.println("该字符" + arr[i] + "非法");
        }
        System.out.println("大写字母有" + bigLetter + "个, 小写字母有" + smallLetter + "个，数字有" + num + "个");


    }


}
