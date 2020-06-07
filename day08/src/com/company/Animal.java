package com.company;

/**
 * @author lbf
 * @date 2020/6/7 14:23
 */
public abstract class Animal implements Liveable{
    public abstract void eat();

    @Override
    public void func() {

    }

    @Override
    public void show() {

    }
    //无法重写静态方法

}
