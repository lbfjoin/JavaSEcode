package com.company;

/**
 * @author lbf
 * @date 2020/5/10 14:21
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        Student student1 = new Student("lbf", 18);
        System.out.println(student1);
    }
}
