package com.company;

/**
 * @author lbf
 * @date 2020/5/31 20:45
 */
public class AnimalLiveable implements Liveable {
    //alt+ shift + enter导入所有抽象方法

    @Override
    public void eat() {
        System.out.println("咔咔造");
    }

    @Override
    public void sleep() {
        System.out.println("呼呼睡");
    }
}
