package com.company.exercise;

/**
 * @author lbf
 * @date 2020/7/26 15:12
 */
public class Student extends Person {
    private int grade;
    public Student(){

    }
    public Student(String name,int age,int grade){
        super(name,age);
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(){
        this.grade = grade;
    }

    @Override
    public void showMsg() {
        System.out.println(getName()+"同学" + ",考试得了：" + grade + "分");
    }
}
