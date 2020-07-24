package com.company;

/**
 * @author lbf
 * @date 2020/7/23 15:29
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        //将此String与另一个String比较
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
        //将此String与另一个String比较，不考虑大小写
        System.out.println(s1.equalsIgnoreCase(s3)); //true

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3);//false
        int i = 2;
        int k = 2;
        char m = '2';
        System.out.println(i == k);//true
        System.out.println(m == k);//false

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2));//false
        System.out.println(obj1==obj2);//false

        String a = new String("abcd");
        String b = new String("abcd");
        //abcd 放在常量池中
        String c = "abcd";
        String d = "abcd";
        if (a == b ){                 //false
            //不是同一个对象
            System.out.println("a == b");
        }
        if (a.equals(b)){           //a==b
            // String重写了equals方法
            System.out.println("a==b");
        }
        if (c == d){              //c==d
            //true 共享同一变量
            System.out.println("c=d");
        }
        if (c.equals(d)){          //c==d

            System.out.println("c==d");
        }



    }
}
