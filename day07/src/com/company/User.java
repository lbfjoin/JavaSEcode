package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author lbf
 * @date 2020/5/31 18:05
 */
public class User {
    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
    //显示一下当前用户有多少钱
    public void show() {
        System.out.println("我叫：" + this.name + ",我有" + this.money + "元");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
