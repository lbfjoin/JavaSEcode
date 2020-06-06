package com.company;

/**
 * @author lbf
 * @date 2020/5/31 20:56
 */
public class AnimalLiveable1 implements Liveable1{
    //继承什么都可以不用写，直接调用即可
//    @Override
//    public void fly() {
//    }
    //重写


    @Override
    public void fly() {
        System.out.println("骄傲的飞飞飞");
    }
}
