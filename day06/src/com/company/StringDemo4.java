package com.company;

/**
 * @author lbf
 * @date 2020/5/17 16:17
 */
public class StringDemo4 {
    public static void main(String[] args) {
        //转化功能的方法
//   7. toCharArray()
//    将此字符串转换为一个新的字符数组
        String s = "abcde";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
//   8. getBytes(String charsetName)
//    使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + "\t");
        }
        System.out.println();
//    9.replace(CharSequence target, CharSequence replacement)
//    使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
        String str = "itwangzhe  it qingtong";
        String replace = str.replace("it", "IT");
        str = replace;
        System.out.println(str);
    }
}
