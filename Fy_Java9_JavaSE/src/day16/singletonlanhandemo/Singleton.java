package day16.singletonlanhandemo;

import javax.swing.*;

/**
 * @author lbf
 * @date 2020/7/31 8:52
 * 顾名思义即使实例在用到的时候去创建，比较懒
 * 延迟初始化，
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    ;

    public static Singleton getInstance() {
        //特点，只是第一次生成对象，效率较高
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}




