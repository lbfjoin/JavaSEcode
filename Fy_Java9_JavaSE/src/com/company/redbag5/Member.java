package com.company.redbag5;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/7/26 18:10
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> receive(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
        int removeMoney = list.remove(index);

        int updateMoney = removeMoney + super.getMoney();
        setMoney(updateMoney);
        return list;
    }
}
