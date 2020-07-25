package com.company.redbag4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/7/24 18:53
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",200);
        Member member1 = new Member("成员A",9);
        Member member2 = new Member("成员B",0);
        Member member3 = new Member("成员C",0);
        manager.show();
        member1.show();
        member2.show();
        member3.show();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入红包金额");
        int money = scanner.nextInt();
        System.out.println("请输入红包个数");
        int count = scanner.nextInt();
        ArrayList<Integer> list = manager.send(money, count);
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);

        manager.show();
        member1.show();
        member2.show();
        member3.show();

    }
}
