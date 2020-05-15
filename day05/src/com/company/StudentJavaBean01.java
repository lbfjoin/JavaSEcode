package com.company;

/**
 * @author lbf
 * @date 2020/5/15 9:04
 */
public class StudentJavaBean01 {
    private String name;
    private int age;

    public StudentJavaBean01(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
