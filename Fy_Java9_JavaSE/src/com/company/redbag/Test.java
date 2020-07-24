package com.company.redbag;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/7/23 10:54
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",150);
        Member one = new Member("成员A",9);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额");
        int money =scanner.nextInt();
        System.out.println("请输入发几个红包");
        int count = scanner.nextInt();

        ArrayList<Integer> redList = manager.send(money, count);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();

    }

}
