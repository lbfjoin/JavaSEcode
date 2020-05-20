package com.company;

import java.security.PublicKey;

/**
 * @author lbf
 * @date 2020/5/14 22:18
 */
public class EmpJavaBean01 {
    private String name;
    private int age;
    private int jobNO;
    private int salary;

    public EmpJavaBean01() {
    }

    public EmpJavaBean01(String name, int age, int jobNO, int salary) {
        this.name = name;
        this.age = age;
        this.jobNO = jobNO;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getJobNO() {
        return jobNO;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobNO(int jobNO) {
        this.jobNO = jobNO;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age){
        this.age = age;
    }
}

