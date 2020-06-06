package com.company;

import java.security.PublicKey;

/**
 * @author lbf
 * @date 2020/5/14 22:18
 */
public class EmpJavaBean01 {
    private String name;
    private int age;
    private int wages;
    private String occupation;
    private static int number;
    static {
        number = 0;
    }

    public EmpJavaBean01() {
    }

    public EmpJavaBean01(String name, int age , int wages, String occupation){
        this.name = name;
        this.age = age;
        this.wages = wages;
        this.occupation = occupation;
        this.number = ++number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public static void showNumber() {
        System.out.println("name" + number);
    }
}

