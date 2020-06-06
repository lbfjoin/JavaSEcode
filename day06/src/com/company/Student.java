package com.company;

/**
 * @author lbf
 * @date 2020/5/17 18:43
 */
public class Student {
    //学生id
    private int sid; //0
    private String name; //null
    private int age;

    //类变量  记录学生数量，分配学号


//   static修饰的内容
//    - 随着类的加载而加载，且只加载一次
//    - 存储与方法区的静态区，所以直接可以用类名调用
//    - 优于对象存在，可以被所有对象共享
    public static int numberOfStudent = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudent;
    }

    public void show(){
        System.out.println("student:name" + name +",age = " + age + "sid = " + sid);
    }
    public static void showNum(){
        System.out.println("num" + numberOfStudent);
    }
}
