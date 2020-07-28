package com.company.exercise;

/**
 * @author lbf
 * @date 2020/7/26 10:45
 */
public class Person {
    private String name;
    private int age;
    public Person(){

    }
    public Person(String name ,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public void showMsg(){
        System.out.println();
    }
}
