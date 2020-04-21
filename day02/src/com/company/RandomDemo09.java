package com.company;

import java.util.Random;

/**
 * @author lbf
 * @date 2020/4/19 20:08
 */
public class RandomDemo09 {
    public static void main(String[] args) {
        //    Random random = new Random(666);
        Random random = new Random(666);
        random.setSeed(666);
        for (int i = 0; i <10 ; i++) {
            System.out.println(random.nextInt(100));

        }
    }
}

