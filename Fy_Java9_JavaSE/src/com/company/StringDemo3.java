package com.company;

/**
 * @author lbf
 * @date 2020/7/23 16:58
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String s = "helloworld";
        //  转化为字符数组
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + "\t");

        }
        System.out.println();
        //转化为字节数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i < s.getBytes().length; i++) {
            System.out.print(bytes[i] + "\t");

        }
        System.out.println();
        //替换
         s= s.replace("h","H");
        System.out.println(s);
        s = s.replace("wo","WO");
        System.out.println(s);


    }

}
