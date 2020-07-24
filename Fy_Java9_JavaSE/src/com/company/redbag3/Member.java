package com.company.redbag3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/7/23 19:55
 */
public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());

        int removeMoney = list.remove(index);
        int leftMoney = super.getMoney();
        int updatMoney = leftMoney + removeMoney;


    }
}
