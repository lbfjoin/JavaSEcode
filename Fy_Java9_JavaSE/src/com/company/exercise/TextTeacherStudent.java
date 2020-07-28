package com.company.exercise;

/**
 * @author lbf
 * @date 2020/7/26 15:21
 */
public class TextTeacherStudent {
    public static void main(String[] args) {
        Student s = new Student("李小乐", 21, 90);
        Teacher t = new Teacher("王小平", 30, "Java");
        t.showMsg();
        s.showMsg();

    }
}
