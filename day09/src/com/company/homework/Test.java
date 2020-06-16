package com.company.homework;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/6/14 20:47
 */
public class Test {
    public static void main(String[] args) {
        Student one = new Student("小红");
        Student two = new Student("小亮");
        Student three = new Student("小明");
        ArrayList<Student> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        Teacher teacher = new Teacher("张老师");
        Course course = new Course("Java",teacher,list);
        teacher.dianMing(list);
        course.show();
    }
}
