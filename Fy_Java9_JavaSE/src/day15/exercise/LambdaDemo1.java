package day15.exercise;

/**
 * @author lbf
 * @date 2020/8/2 19:42
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        invoke(()->{
            System.out.println("lambda表达式");
        });
    }

    public static void invoke(LambdaCook cook){
        cook.makeFood();
    }
}
