package day15.exercise;

/**
 * @author lbf
 * @date 2020/8/2 20:04
 */
public class Calculate {
    public static void main(String[] args) {
         getCalculator(5,6,(int a, int b)->{
             System.out.println(a+b);
        });
    }
    public static void getCalculator(int a,int b,Calculator calculator){
        calculator.calculate(a,b);

    }
}
