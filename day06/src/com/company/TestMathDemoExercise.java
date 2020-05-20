package com.company;

/**
 * @author lbf
 * @date 2020/5/19 16:46
 * 1.abs(double a) 返回 double 值的绝对值。
 * 2.ceil(double a)返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。返回大于等于参数的最小整数
 * 3.round(double a) 返回最接近参数的 long。(四舍五入）
 */
public class TestMathDemoExercise {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2));//2
        System.out.println(Math.ceil(5.3)); //6.0  double类型
        System.out.println(Math.ceil(-5.3));//-5.0
        System.out.println(Math.ceil(5.6));// 6.0
        System.out.println(Math.round(5.3)); //5
        System.out.println(Math.round(5.6));//6
    }

}
