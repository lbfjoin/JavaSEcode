package com.company;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/5/15 10:33
 */
public class Test02StudentArray01 {
    public static void main(String[] args) {
        ArrayList<StudentJavaBean> list = new ArrayList<>();
        StudentJavaBean l = new StudentJavaBean("l", 22);
        StudentJavaBean b = new StudentJavaBean("b", 22);
        StudentJavaBean f = new StudentJavaBean("f", 22);
        StudentJavaBean lbf = new StudentJavaBean("lbf", 22);
        list.add(l);
        list.add(b);
        list.add(f);
        list.add(lbf);
        System.out.println(list); // 输出的是地址
        for (int i = 0; i < list.size(); i++) {
            StudentJavaBean bean = list.get(i);
            System.out.println(bean.getName() + ":" + bean.getAge());
        }
    }
}
