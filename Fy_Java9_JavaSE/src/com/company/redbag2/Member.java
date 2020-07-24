package com.company.redbag2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/7/23 18:19
 */
public class Member extends User {
    public Member(){
    }
    public Member(String name,int money){
        super(name,money);
    }
    public void receive(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
        Integer removeMoney = list.remove(index);

        int leftMoney = super.getMoney();
        int updateMoney = leftMoney + removeMoney;
        super.setMoney(updateMoney);
    }
}
