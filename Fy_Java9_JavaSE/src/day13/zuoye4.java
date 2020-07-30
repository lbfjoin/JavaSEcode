package day13;

import day10.chongming.A;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/28 19:09
 */
public class zuoye4 {
    public static void main(String[] args) {
        //定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("s");
        boolean contain = isContain(list, "s");
        System.out.println(contain);
    }

    public static boolean isContain(ArrayList<String> list, String s) {
        if (list.contains(s)) {
            return true;
        }else
            return false;
    }
}
