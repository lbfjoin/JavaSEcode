package day13;

/**
 * @author lbf
 * @date 2020/7/28 14:09
 */
public class Demo {
    public static void main(String[] args) {
        //“123”   123
        //基本类型转为String类型
        int a = 100;
        String b = " " + 100;
        System.out.println(b); //字符串100
        //String 类型转换为基本类型
        //包装类都有parseXxx静态方法可以将字符串参数转换为对应的基本类型
        int c = Integer.parseInt("120");
        System.out.println(c);
        Integer d = Integer.valueOf("133");
        System.out.println(d);
    }
}
