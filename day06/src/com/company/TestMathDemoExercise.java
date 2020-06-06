package com.company;

import javax.swing.plaf.metal.MetalTabbedPaneUI;
import java.sql.SQLOutput;

/**
 * @author lbf
 * @date 2020/5/19 16:46
 * 1.abs(double a) 返回 double 值的绝对值。
 * 2.ceil(double a)返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。返回大于等于参数的最小整数
 * 3.round(double a) 返回最接近参数的 long。(四舍五入）
 */
public class TestMathDemoExercise {
    //    public static void main(String[] args) {
//        System.out.println(Math.abs(-3));
//        System.out.println(Math.ceil(5.3));
//        System.out.println(Math.ceil(-5.3));
//        System.out.println(Math.ceil(5.6));
//        System.out.println(Math.floor(5.3));
//        System.out.println(Math.floor(-5.3));
//        System.out.println(Math.floor(5.6));
//        System.out.println(Math.round(5.3));
//        System.out.println(Math.round(5.6));
//        System.out.println(Math.round(-5.6));
//    }
    //计算在-10.8 到 5.9 之间
    //绝对值大于等于6或者小于2.1的整数有多少个
    public static void main(String[] args) {
        int count = 0;
        for (double i = Math.ceil(-10.8) ; i <= Math.ceil(5.9);i++) {
            if (Math.abs(i) >= 6 || Math.abs(i) <= 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);

    }
}
