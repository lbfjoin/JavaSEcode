package com.company;

/**
 * @author lbf
 * @date 2020/4/29 11:20
 */
public class Test02_Student1 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.grade = 12;
        s.name = "lbf";
        s.sno = 1710030109;
        System.out.println(s.name);
        System.out.println(s.grade);
        System.out.println(s.sno);
        s.play("lbf");
        s.champion("lbf");
    }
}
