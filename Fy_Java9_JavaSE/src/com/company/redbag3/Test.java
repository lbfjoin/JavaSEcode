package com.company.redbag3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/7/23 19:55
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",200);
        Member member = new Member("成员A",9);
        Member member1 = new Member("成员B",0);
        Member member2 = new Member("成员C",0);
        manager.show();
        member.show();
        member1.show();
        member2.show();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入红包金额");
        int totalMoney = scanner.nextInt();
        System.out.println("请输入红包个数");
        int count = scanner.nextInt();
        ArrayList<Integer> redList = manager.send(totalMoney,count);
        member.receive(redList);
        member1.receive(redList);
        member2.receive(redList);

        manager.show();
        member.show();
        member1.show();
        member2.show();

    }
}
