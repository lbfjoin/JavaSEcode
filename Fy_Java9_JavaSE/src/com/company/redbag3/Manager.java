package com.company.redbag3;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/23 19:55
 */
public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();
        if (leftMoney < totalMoney){
            System.out.println("余额不足");
        }
        int avg = totalMoney /count;
        int rem = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int lastMoney = avg + rem;
        redList.add(lastMoney);
        super.setMoney(leftMoney - totalMoney);
        return redList;
    }
}
