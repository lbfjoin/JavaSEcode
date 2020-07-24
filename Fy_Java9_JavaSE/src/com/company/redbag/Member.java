package com.company.redbag;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/7/23 10:11
 */
public class Member extends User {
    public Member() {
    }

    public Member(String userName, int leftMoney) {
        super(userName, leftMoney);
    }

    public  void receive(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
//        Integer money = list.get(index);
        //收完之后删除
        Integer removeMoney = list.remove(index);
        //更新余额
        int leftMoney = super.getLeftMoney();
        int updateMoney = leftMoney + removeMoney;
        super.setLeftMoney(updateMoney);


    }

}
