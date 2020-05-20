package com.company;

/**
 * @author lbf
 * @date 2020/5/17 14:35
 * 1.equal(Object anObject)将此字符串与指定的对象比较。返回值类型boolean ( equalsIgnoreCase（）：忽略大小写进行比较）
 * 2.int length() 返回此字符串的长度。  实际调用的是 底层length数组的属性
 * 3.concat(String str) 将指定字符串连接到此字符串的结尾 和字符串拼接很像
 * 4.charAt(int index)返回指定索引处的 char 值。
 * 5.indexOf(String str) 返回指定子字符串在此字符串中第一次出现处的索引。
 * 6.substring(int beginIndex, int endIndex) 返回一个新字符串，它是此字符串的一个子字符串。
 *  转化功能的方法
 * 7. toCharArray()将此字符串转换为一个新的字符数组
 * 8. getBytes(String charsetName)使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
 * 9.replace(CharSequence target, CharSequence replacement)  使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 * 10.split(String regex) 根据给定正则表达式的匹配拆分此字符串。
 *
 *
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //String 的 equal方法
        //创建字符串
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        //1.equal(Object anObject)将此字符串与指定的对象比较。返回值类型boolean
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));

        boolean b = s1.equals(s3);
        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s2));//true  'equalsIgnoreCase' 忽略大小写
        System.out.println(s1.equalsIgnoreCase(s3));//true
        //扩展 ： 大厂面试题（重点中的重点）
        //基本数据类型的比较用 ：==
        //引用数据类型比较的是地址值
        //String 的 equals 是如何实现的
//        public boolean equals(Object anObject) {
//            if (this == anObject) {
//                return true;
//            } // 跟自己进行一次比较
//            if (anObject instanceof String) {  // 传入的 anObject是否属于String类型
//                String anotherString = (String)anObject;  // anObject强制转换String类型
//                int n = value.length; // s1长度
//                if (n == anotherString.value.length) {
//                    char v1[] = value;   // 赋值
//                    char v2[] = anotherString.value; // 赋值
//                    int i = 0;
//                    while (n-- != 0) {   // v1 和v2中每一个元素逐一比较
//                        if (v1[i] != v2[i])
//                            return false;
//                        i++;
//                    }
//                    return true;
//                }
//            }
//            return false;
//        }

    }


}
