package day15.lambdaDemo;

import static day15.lambdaDemo.Demo1.invoke;

/**
 * @author lbf
 * @date 2020/7/30 14:37
 */
public class Demo2 {
    public static void main(String[] args) {
        //(参数类型 参数名) ->{代码语句}
        invoke(() ->{
            System.out.println("lambda表达式做的饭做好了");
        });
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }

}
