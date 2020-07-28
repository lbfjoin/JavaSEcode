package day11.ClassMember;

/**
 * @author lbf
 * @date 2020/7/25 14:14
 */
public class Test {
    public static void main(String[] args) {
        Armour ar = new Armour("一级头",200);
        Weapon wp = new Weapon("98K", 9999);
        Role role = new Role();
        //设置武器
        role.setWp(wp);
        //设置防御
        role.setAr(ar);
        //攻击
        role.attack();
        //增加防御
        role.wear();


    }
}
