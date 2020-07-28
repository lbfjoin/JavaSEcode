package com.company.redbag5;

/**
 * @author lbf
 * @date 2020/7/26 18:09
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
    public void  show(){
        System.out.println("用户" + name + "的余额为" + money + "元");
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
