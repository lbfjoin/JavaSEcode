package com.company;

/**
 * @author lbf
 * @date 2020/6/14 15:14
 */
public class InnerDemoTest4 {
    public static void main(String[] args) {
     //实际开发中常用的形式
        showFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("我要起飞了");
            }
        });
        //将带有匿名内部类作为方法的参数进行传递
    }

    public static void showFly(FlyAble f) {
        f.fly();
    }
}
