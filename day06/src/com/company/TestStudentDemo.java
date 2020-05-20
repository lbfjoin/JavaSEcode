package com.company;

/**
 * @author lbf
 * @date 2020/5/17 18:51
 */
public class TestStudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 10);
        Student s3 = new Student("王五", 12);
        Student s4 = new Student("赵六", 13);
        Student s5 = new Student("赵六", 13);

        s1.show();
        s2.show();
        s3.show();
        s4.show();
        Student.showNum();

    }
}
