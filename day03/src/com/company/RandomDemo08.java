package com.company;

import java.util.Random;

/**
 * @author lbf
 * @date 2020/4/19 20:05
 * 随机种子 seed
 * 作用是重新设置random对象的种子数
 * 设置完种子数以后的Random 对象和相同的种子数
 * new 创建出来的对象相同
 */
public class RandomDemo08 {
    public static void main(String[] args) {
    //    Random random = new Random(666);
        Random random = new Random(666);
        random.setSeed(666);
        for (int i = 0; i <10 ; i++) {
            System.out.println(random.nextInt(100));

        }
    }
}
