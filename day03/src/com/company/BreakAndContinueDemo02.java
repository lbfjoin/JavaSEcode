package com.company;

/**
 * @author lbf
 * @date 2020/4/19 16:25
 */
public class BreakAndContinueDemo02 {
    public static void main(String[] args) {
        //关于continue的入门案例
        //打印1-10之间所有不是3倍数的整数
        for (int i = 1; i <= 10 ; i++) {
            //判断该数是否为3的倍数
            if ( i % 3 == 0)
                continue;
            //如果不是3的倍数，就打印
            System.out.println(i);

        }
    }
}
