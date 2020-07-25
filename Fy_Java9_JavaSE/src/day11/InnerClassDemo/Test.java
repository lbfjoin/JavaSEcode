package day11.InnerClassDemo;

/**
 * @author lbf
 * @date 2020/7/25 10:29
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
//        外部类名.内部类名.对象名 = new 外部类型().new 内部类型().
        Person.Heart heart = p.new Heart();
        heart.jump();
        p.setLive(false);
        heart.jump();
    }
}
