package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/5/31 18:15
 * 普通成员类
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    //收红包
    public void receive(ArrayList<Integer> list){
        //从众多的红包中随机选一个，获取随机索引
        int index = new Random().nextInt(list.size());

        //根据索引，从集合中删除领完的那个红包
        int receiveMoney = list.get(index);
        int delMoney = list.remove(index);

        //查看当前会员还有多少钱
        int money = super.getMoney();
        //重新设置一下余额
        super.setMoney(money + receiveMoney);
    }
}