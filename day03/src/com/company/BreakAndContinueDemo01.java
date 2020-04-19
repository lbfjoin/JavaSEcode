package com.company;

/**
 * @author lbf
 * @date 2020/4/19 15:29
 * BreakAndContinue
 * break 跳出本层循环
 * continue 用来结束本次循环，进行下一次循环
 */
public class BreakAndContinueDemo01 {
    //打印10次 HelloWorld ,当打印第六次的时候，结束循环
    public static void main(String[] args) {
        System.out.println("start");
// 定义10次循环
        for (int i = 1; i <= 10; i++) {
            //判断 i==6时，结束循环
            if (i ==6)
                break;
            System.out.println("hello world"+ i);
        }
        System.out.println("end");
    }
}
