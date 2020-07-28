package day12;

/**
 * @author lbf
 * @date 2020/7/27 14:29
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("张三",111);
        Person p2 = new Person("张三",111);
        Person p3 = new Person("李四",111);

        System.out.println(p1);
        System.out.println(p1.equals(p2));//true
        System.out.println(p1.equals(p3));//false
    }

}
