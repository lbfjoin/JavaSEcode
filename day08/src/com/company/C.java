package com.company;

/**
 * @author lbf
 * @date 2020/6/7 15:31
 */
public class C extends D implements A {
    //未重写method方法，执行输出为"DDDDDDDDDD"

    //重写method方法，执行C类的method方法
    public void method(){
        System.out.println("CCCCCCCCCC");
    }

}
