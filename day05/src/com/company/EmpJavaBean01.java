package com.company;

/**
 * @author lbf
 * @date 2020/5/14 22:18
 */
public class EmpJavaBean01 {
    private String name;
    private int age;
    private int sno;
    private int salary;

    public EmpJavaBean01() {

    }

    public EmpJavaBean01(String name, int age, int sno, int salary) {
        this.name = name;
        this.age = age;
        this.sno = sno;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getSno(){
        return sno;
    }
    public void setSno(int sno){
        this.sno = sno;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }


}

