package com.company;

/**
 * @author lbf
 * @date 2020/5/17 15:35
 */
public class StringDemo3 {
    private char value[];

    public StringDemo3(char[] value) {
        this.value = value;
    }
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        } // 跟自己进行一次比较
        if (anObject instanceof StringDemo3) {  // 传入的 anObject是否属于String类型
            StringDemo3 anotherString = (StringDemo3) anObject;  // anObject强制转换String类型
            int n = value.length; // s1长度
            if (n == anotherString.value.length) {
                char v1[] = value;   // 赋值
                char v2[] = anotherString.value; // 赋值
                int i = 0;
                while (n-- != 0) {   // v1 和v2中每一个元素逐一比较
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
}
