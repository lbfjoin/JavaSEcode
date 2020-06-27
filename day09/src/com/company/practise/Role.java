package com.company.practise;

import com.company.Weapon;

/**
 * @author lbf
 * @date 2020/6/20 14:18
 */
public class Role {
    private int id;//角色id
    private int blood;//生命值
    private String name;//角色名

    private Weapon wp;
    private Armour ar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armour getAr() {
        return ar;
    }

    public void setAr(Armour ar) {
        this.ar = ar;
    }
    
}
