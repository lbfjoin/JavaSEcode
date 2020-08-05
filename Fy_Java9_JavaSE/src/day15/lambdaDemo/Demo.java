package day15.lambdaDemo;

/**
 * @author lbf
 * @date 2020/7/30 14:48
 */
public class Demo {
    public static void main(String[] args) {
        Cook cook = new CookImpl();
        invoke(cook);
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
