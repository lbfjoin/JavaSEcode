package com.company;

import java.util.Random;

/**
 * @author lbf
 * @date 2020/5/10 16:57
 */
public class Test01Random {
    public static void main(String[] args) {
        //Random类用于生成伪随机数
        Random random = new Random();
        //生成[0，n)的随机整数
        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(1);
            System.out.println(i);
        }
    }
}
