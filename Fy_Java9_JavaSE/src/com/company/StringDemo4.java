package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author lbf
 * @date 2020/7/23 17:07
 */
public class StringDemo4 {
    public static void main(String[] args) {
        String s = "11211547542441.@qq.com";
        String[] strings = s.split("@");
        System.out.println(Arrays.toString(strings));

        String s1 = "aa/bb/vv";
        String[] strings1 = s1.split("/");
        System.out.println(Arrays.toString(strings1));
    }
}
