package com.company;

/**
 * @author lbf
 * @date 2020/5/17 15:06
 */
public class StringDemo2 {
    public static void main(String[] args) {
        //2.int length() 返回此字符串的长度。  实际调用的是 底层length数组的属性
        //阅读源码，源码的书写都是很严谨标准，学习，2.好公司面试经常会问
        String s = "helloworld";
        System.out.println(s.length());
        System.out.println("+++++++++++++++++++");
        //3.concat(String str) 将指定字符串连接到此字符串的结尾 和字符串拼接很像
        String s1 = s.concat("**hello");
        System.out.println(s1);
        //4.charAt(int index)返回指定索引处的 char 值。
        char c = s.charAt(0);
        System.out.println(c);
        char c2 = s.charAt(1);
        System.out.println(c2);
        //5.indexOf(String str) 返回指定子字符串在此字符串中第一次出现处的索引。
        //没有返回-1
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("z"));

        //6.substring(int beginIndex, int endIndex) 返回一个新字符串，它是此字符串的一个子字符串。
        //[beginIndex, endIndex) 左闭右开
        String s2 = s.substring(0);
        System.out.println(s2.equals(s1));
        System.out.println(s2 == s1);
        System.out.println(s.substring(5));
        System.out.println(s.substring(3,9));

    }
}
