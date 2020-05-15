package com.company;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/5/15 10:33
 */
public class Test02StudentArray01 {
    public static void main(String[] args) {
        ArrayList<StudentJavaBean> s = new ArrayList<>();
        StudentJavaBean l = new StudentJavaBean("l", 11);
        StudentJavaBean l1 = new StudentJavaBean("b", 11);
        StudentJavaBean l2 = new StudentJavaBean("f", 11);
        StudentJavaBean l3 = new StudentJavaBean("lbf", 11);
        s.add(l);
        s.add(l1);
        s.add(l2);
        s.add(l3);
        System.out.println(s.size());
        System.out.print(s + "\t");
        for (int i = 0; i < s.size(); i++) {
            StudentJavaBean ss = s.get(i);
            System.out.println(ss.getName() + " \t" + ss.getAge());
//            System.out.println(s.get(i).getName()+ "\t" + s.get(i).getAge());
        }
        System.out.println();

    }
}
