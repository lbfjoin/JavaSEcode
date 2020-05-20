package com.company;

/**
 * @author lbf
 * @date 2020/5/18 15:56
 * 1.equal(Object anObject)将此字符串与指定的对象比较。返回值类型boolean
 * 2.int length() 返回此字符串的长度。  实际调用的是 底层length数组的属性
 * 3.concat(String str) 将指定字符串连接到此字符串的结尾 和字符串拼接很像
 * 4.charAt(int index)返回指定索引处的 char 值。
 * 5.indexOf(String str) 返回指定子字符串在此字符串中第一次出现处的索引。
 * 6.substring(int beginIndex, int endIndex) 返回一个新字符串，它是此字符串的一个子字符串。
 * 转化功能的方法
 * 7. toCharArray()将此字符串转换为一个新的字符数组
 * 8. getBytes(String charsetName)使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
 * 9.replace(CharSequence target, CharSequence replacement)  使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 * 10.split(String regex) 根据给定正则表达式的匹配拆分此字符串。
 */
public class StringDemoExercise {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println(s1 == s2); // true  比较的是字符串内容    引用数据类型比较的是地址值；基本数据类型比较的是内容
        System.out.println(s1.length());//字符串s1的长度
        String s4 = "world";
        System.out.println(s1.concat(s4)); //将字符串s4拼接在字符串s1后
        System.out.println(s4.charAt(2)); //索引出字符串s4第二位的char值
        System.out.println(s4.indexOf("r")); // 求出字母"r" 在字符串s4第一次出现的索引位
        System.out.println(s4.substring(1,3)); // 输出字符串s4 索引位[1，3）的字符
//String 的转化功能的方法
        System.out.println(s4.toCharArray());//把字符串s4转化成字符数组形式
        String s5 = "helloworld";
        byte[] bytes = s5.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + "\t");
        }
        System.out.println();
        System.out.println(s5.replace("h", "H")); //把s5中的"h"替换成"H"
        String s6 = s5;
        System.out.println(s6.replace("w","W"));//把s5中的"w"替换成"W"
        String[] ls = s6.split("l",2); // 把
        String[] ls1 = s6.split("l");
        for (int i = 0; i < ls.length; i++) {
            System.out.print(ls[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < ls1.length; i++) {
            System.out.print(ls1[i] + "\t");
        }
    }
}
