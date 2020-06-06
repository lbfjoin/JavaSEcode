package com.company;

/**
 * @author lbf
 * @date 2020/5/24 11:14
 */
public class Student01 {
    private String name;
    private int age;
    public static int number;
    static {
        number = 0;
    }
    public Student01(String name, int age){
        this.name = name;
        this.age = age;
        this.number = ++number;
    }

    public  void getStudent(){
        System.out.println(name + ":" + age );
    }
    public static void showStudentNum(){
        System.out.println(number);
    }
}
