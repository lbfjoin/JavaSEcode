package com.company.homework;

/**
 * @author lbf
 * @date 2020/6/14 20:18
 */
public class Student {
    private String name;
    private boolean attendence;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAttendence() {
        return attendence;
    }

    public void setAttendence(boolean attendence) {
        this.attendence = attendence;
    }
}
