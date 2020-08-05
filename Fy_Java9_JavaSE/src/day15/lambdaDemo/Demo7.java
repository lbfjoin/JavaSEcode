package day15.lambdaDemo;

/**
 * @author lbf
 * @date 2020/7/30 17:01
 */
public class Demo7 {
    public static void main(String[] args) {
        //使用lambda表达式调用
        invokeShow(100,a -> a + 100);
    }
    public static void invokeShow(int a, Show show){
        int res = show.showNumber(a);
        System.out.println(res);

    }
}
