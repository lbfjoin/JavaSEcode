package com.company.zuoye;

/**
 * @author lbf
 * @date 2020/7/23 14:15
 */
public abstract class C extends B {
 int numc = 30;
    @Override
    public void showB() {
        System.out.println("numb"+ numb);
    }

    @Override
    public void showA() {
        System.out.println("numa"+numa);
    }

    public void showC() {
        System.out.println("numc"+numc);
    }

}
