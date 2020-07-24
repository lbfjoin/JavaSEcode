package com.company.redbag2;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/23 18:19
 */
public class Manager extends User{
    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        super.setMoney(leftMoney - totalMoney);
        int avg = totalMoney / count;
        int rem = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);

        }
        int last = avg +rem;
        redList.add(last);
        return redList;
    }
}
