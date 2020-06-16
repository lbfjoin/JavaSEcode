package com.company.homework;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/6/14 20:21
 */
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dianMing(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (!student.getName().equals("小明")) {
                student.setAttendence(true);
            }
        }

    }



}

