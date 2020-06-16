package com.company.homework;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/6/14 20:38
 */
public class Course {
    private String course;
    private Teacher teacher;
    private ArrayList<Student> list;

    public Course(String course, Teacher teacher, ArrayList<Student> list) {
        this.course = course;
        this.teacher = teacher;
        this.list = list;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void show() {
        System.out.println("课程名称：" + course);
        System.out.println("授课老师：" + teacher.getName());
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.isAttendence()) {
                System.out.println("上课" + student.getName());
            } else {
                System.out.println("旷课" + student.getName());
            }
        }
    }
}
