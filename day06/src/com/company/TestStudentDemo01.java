package com.company;

/**
 * @author lbf
 * @date 2020/5/24 11:30
 */
public class TestStudentDemo01 {
    public static void main(String[] args) {
        Student01 s1 = new Student01("l",22);
        Student01 s2 = new Student01("b",22);
        Student01 s3 = new Student01("f",22);
        Student01 s4 = new Student01("lbf",22);
        Student01 s5 = new Student01("lll",22);
        s1.getStudent();
        s2.getStudent();
        s3.getStudent();
        s4.getStudent();
        s5.getStudent();
        Student01.showStudentNum();



    }
}
