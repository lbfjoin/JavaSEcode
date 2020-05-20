package com.company;

/**
 * @author lbf
 * @date 2020/5/15 9:05
 */
public class Test01StudentArray01 {
    public static void main(String[] args) {
        //创建一个学生数组，存储刘、关、张、赵四位同学的信息
        StudentJavaBean[] studentJavaBeans = new StudentJavaBean[4];
        StudentJavaBean s1 = new StudentJavaBean("刘备",55);
        StudentJavaBean s2 = new StudentJavaBean("关羽",52);
        StudentJavaBean s3 = new StudentJavaBean("张飞",50);
        StudentJavaBean s4 = new StudentJavaBean("赵云",44);
        studentJavaBeans[0] = s1;
        studentJavaBeans[1] = s2;
        studentJavaBeans[2] = s3;
        studentJavaBeans[3] = s4;
        for (int i = 0; i < studentJavaBeans.length; i++) {
            System.out.println(studentJavaBeans[i]); //输出的为地址
        }
        for (int i = 0; i < studentJavaBeans.length; i++) {
            StudentJavaBean ss = studentJavaBeans[i];
            System.out.println(ss.getName() + ss.getAge());
        }
    }
}
