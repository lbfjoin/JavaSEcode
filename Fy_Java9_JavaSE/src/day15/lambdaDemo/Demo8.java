package day15.lambdaDemo;

/**
 * @author lbf
 * @date 2020/7/30 17:04
 */
public class Demo8 {
    public static void main(String[] args) {
        invoke(()-> System.out.println("省略在做饭"));

    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }

}
