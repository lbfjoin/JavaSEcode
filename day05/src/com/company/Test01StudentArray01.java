package com.company;

/**
 * @author lbf
 * @date 2020/5/15 9:05
 */
public class Test01StudentArray01 {
    public static void main(String[] args) {
        StudentJavaBean[] s = new StudentJavaBean[4];
        StudentJavaBean s1 = new StudentJavaBean("刘备", 50);
        StudentJavaBean s2 = new StudentJavaBean("关羽", 50);
        StudentJavaBean s3 = new StudentJavaBean("张飞", 50);
        StudentJavaBean s4 = new StudentJavaBean("赵云", 50);
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        s[3] = s4;
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (int i = 0; i < s.length; i++) {
            StudentJavaBean b = s[i];
            System.out.println(b.getName() + ":" + b.getAge());

        }
    }
}
