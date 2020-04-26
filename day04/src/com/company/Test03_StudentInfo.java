package com.company;

/**
 * @author lbf
 * @date 2020/4/26 20:42
 */
public class Test03_StudentInfo {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        System.out.println(studentInfo.getName());
        studentInfo.setName("刘宝枫");
        System.out.println(studentInfo.getName());

    }
}
