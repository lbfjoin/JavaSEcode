package com.company.exercise;

/**
 * @author lbf
 * @date 2020/7/26 15:10
 */
public class Teacher extends Person {
    private String subject;

    public Teacher() {
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public void showMsg(){
        System.out.println(getName() + "老师" + ",讲述" + subject + "课");
    }
}
