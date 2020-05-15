package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/5/10 18:18
 */
public class Test02Random {
    //游戏开始生成一个1-100之间的随机整数number，玩家猜测一个数字guessnumber
    //系统提示猜大了 还是猜小了，直到玩家猜对
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入你猜的数");
            int guessNumber = s.nextInt();
            if (guessNumber < i) {
                System.out.println("猜小了" + i);
            } else if (guessNumber > i) {
                System.out.println("猜大了" + i);
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
