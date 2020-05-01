package com.company;

/**
 * @author lbf
 * @date 2020/4/26 20:41
 */
public class StudentInfo {
    private String name;
    private int age;

    //为成员方法提供公有的get方法（访问获取属性）、set方法（修改属性）
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
    //this的含义
    //this 代表所在类的当前对象的引用（地址值），即对象自己的引用
    //  方法被哪个对象调用，方法中的this就代表哪个对象。
    //  即谁在调用，this就代表谁
}