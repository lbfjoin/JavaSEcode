package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author lbf
 * @date 2020/5/23 22:00
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
public class StringDemoExercise01 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.length());
        String s4 = "world";
        System.out.println(s1.concat(s4));
        String s5 = "helloworld";
        System.out.println(s5.charAt(1));
        System.out.println(s5.indexOf("l"));
        System.out.println(s5.substring(2));
        System.out.println(s5.toCharArray());
        System.out.println(s5.getBytes());
        byte[] arr2 = s5.getBytes();
        for (int i = 0; i < s5.getBytes().length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        System.out.println(s5.replace("l","W"));
        String[] arr3 = s5.split("l");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");

        }
    }
}
