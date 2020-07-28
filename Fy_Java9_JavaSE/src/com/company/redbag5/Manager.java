package com.company.redbag5;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/26 18:09
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);

    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        int leftMoney = super.getMoney();
        if (leftMoney < totalMoney) {
            System.out.println("余额不足");
            return list;
        }
        int avg = totalMoney / count;
        int rem = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            list.add(avg);
        }
        int lastMoney = avg + rem;
        list.add(lastMoney);
        setMoney(leftMoney - totalMoney);
        return list;
    }

}
