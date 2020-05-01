package com.company;

/**
 * @author lbf
 * @date 2020/4/29 14:10
 */
public class Test03_StudentInfo1 {
    public static void main(String[] args) {
        StudentInfo1 s = new StudentInfo1();
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println("---------");
        s.setName("刘宝枫");
        s.setAge(100);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
