package com.company;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/5/10 19:01
 *创建 ArrayList<E> list = new ArrayList<String>();
 *   添加    1. list.add(E e)  将指定的元素添加到此列表的尾部。
 *       2. list.add(int index, E element)     将指定的元素插入此列表中的指定位置。
 *ArrayList 中元素的个数  list.size()  返回此列表中的元素数
 *  访问 ： get(int index)   返回此列表中指定位置上的元素。
 *  遍历：for (int i = 0; i < list.size() ; i++) {
 *              //循环体
 *              }
 */
public class Test02StudentArray {
    public static void main(String[] args) {
   /*     new ArrayList<Student>();   //<E>表示一种指定的数据类型，叫做泛型
        new ArrayList<String>();   //<E>表示一种指定的数据类型，叫做泛型
        new ArrayList<Integer>();   //<E>表示一种指定的数据类型，叫做泛型
*/  //ArrayList   HashMap 必须会
        //使用ArrayList  jdk1.7之前
//        ArrayList<String> list = new ArrayList<String>();
        //使用ArrayList  jdk1.7之后
        ArrayList<StudentJavaBean> list = new ArrayList<>();
        //指定元素添加到集合的尾部
        //list.add("张三");
        //创建刘、关、张、赵四位同学的信息
        StudentJavaBean s1 = new StudentJavaBean("刘备",22);
        StudentJavaBean s2 = new StudentJavaBean("关羽",21);
        StudentJavaBean s3 = new StudentJavaBean("张飞",20);
        StudentJavaBean s4 = new StudentJavaBean("赵云",19);
        System.out.println(list);// 输出为 []
        //进行添加操作
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(list.size());//输出数组长度 4
        System.out.println(list);//输出元素地址  [com.company.StudentJavaBean@2d98a335, com.company.StudentJavaBean@16b98e56, com.company.StudentJavaBean@7ef20235, com.company.StudentJavaBean@27d6c5e0]

        //遍历ArrayList的第一种方式 fori循环
        for (int i = 0; i < list.size() ; i++) {
//            StudentJavaBean s = list.get(i);
//            System.out.println(s.getName() + ":" + s.getAge());
            System.out.println(list.get(i).getName()+ ":" + list.get(i).getAge());
        }


    }
}
