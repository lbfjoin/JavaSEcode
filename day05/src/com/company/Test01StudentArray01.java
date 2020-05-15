package com.company;

/**
 * @author lbf
 * @date 2020/5/15 9:05
 */
public class Test01StudentArray01 {
    public static void main(String[] args) {
        StudentJavaBean01[] student = new StudentJavaBean01[4];
        StudentJavaBean01 s1 = new StudentJavaBean01("l", 11);
        StudentJavaBean01 s2 = new StudentJavaBean01("b", 11);
        StudentJavaBean01 s3 = new StudentJavaBean01("f", 11);
        StudentJavaBean01 s4 = new StudentJavaBean01("lbf", 11);
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        student[3] = s4;
        System.out.println(student[0]);
        System.out.println(student[1]);
        System.out.println(student[2]);
        System.out.println(student[3]);
        for (int i = 0; i < student.length ; i++) {
            StudentJavaBean01 studentJavaBean01 = student[i];
            System.out.println(studentJavaBean01.getName() + " -----" + studentJavaBean01.getAge());
        }
    }
}
