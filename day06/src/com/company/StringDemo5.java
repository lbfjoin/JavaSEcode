package com.company;

/**
 * @author lbf
 * @date 2020/5/17 16:26
 */
public class StringDemo5 {
    public static void main(String[] args) {
        //10.split(String regex) 根据给定正则表达式的匹配拆分此字符串。
        String s = "a a, bb ,cc";
        String[] strArray = s.split("");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + "\t");
        }
    }
}
