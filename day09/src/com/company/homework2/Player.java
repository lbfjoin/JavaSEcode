package com.company.homework2;

/**
 * @author lbf
 * @date 2020/6/14 21:09
 */
public class Player {

    public FightAble select(String str) {
        FaShi faShi = new FaShi();
        ZhanSHI zhanSHI = new ZhanSHI();
        if ("法力角色".equals(str)) {
            return faShi;
        }else if ("武力角色".equals(str)){
            return zhanSHI;
        }else
            return null;
    }
}