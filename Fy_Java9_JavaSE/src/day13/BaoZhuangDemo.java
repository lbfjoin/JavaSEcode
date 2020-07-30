package day13;

/**
 * @author lbf
 * @date 2020/7/28 11:44
 */
public class BaoZhuangDemo {
    public static void main(String[] args) {
//        Integer integer = new Integer(4); //基本====》包装
//        int i = integer.intValue();  //包装变基本
        Integer i = 4;   //自动装箱
        i = i + 4; //自动拆箱
        int a = 100;
        System.out.println("a的值" + a);
    }
}
