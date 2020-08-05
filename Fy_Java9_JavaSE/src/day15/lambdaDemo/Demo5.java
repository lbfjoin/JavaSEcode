package day15.lambdaDemo;

/**
 * @author lbf
 * @date 2020/7/30 16:48
 */
public class Demo5 {
    public static void main(String[] args) {
        //使用lambda表达式调用
        invokeCacu(5,6,(int a,int b)->{
            return a + b;
        });

    }
    public static void invokeCacu(int a, int b, Calculator calculator){
        int res = calculator.cacu(a,b);
        System.out.println("res = " + res);

    }
}
