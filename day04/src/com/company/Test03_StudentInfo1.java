package com.company;

/**
 * @author lbf
 * @date 2020/5/3 15:58
 */
public class Test03_StudentInfo1 {
    public static void main(String[] args) {
        StudentInfo1 studentInfo1 = new StudentInfo1();
        System.out.println(studentInfo1.getName());
        System.out.println(studentInfo1.getAge());
        System.out.println("--------------");
        studentInfo1.setName("lbf");
        studentInfo1.setAge(23);
        System.out.println(studentInfo1.getName());
        System.out.println(studentInfo1.getAge());
    }
}
