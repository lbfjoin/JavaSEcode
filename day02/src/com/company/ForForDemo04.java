package com.company;

/**
 * @author lbf
 * @date 2020/4/19 16:40
 * 打印 1 天内 所有的时间格式
 * 格式是12时48分
 */
public class ForForDemo04 {
    public static void main(String[] args) {
        for (int i = 1; i <=24 ; i++) {
            for (int j = 1; j <= 60 ; j++) {
                System.out.print(i + "时" + j + "分\t");
            }
            System.out.println();
        }
    }
}
