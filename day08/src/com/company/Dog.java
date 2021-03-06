package com.company;

/**
 * @author lbf
 * @date 2020/6/7 15:06
 */
public class Dog extends Animal implements Liveable,Pet {
//    接口的多实现，Java中是单继承 多实现：一个类可以实现多个接口 ；一个类能继承一个父类同时实现多个接口
//多实现的格式：
//    class 类名 [extends 父类名] implements 接口1，接口2.。。。{
//        }
//        //必须重写接口中所有的抽象方法
//          重写接口中的默认方法
//    注：如果抽象方法有重名的，只需重写一次就可以
//        如果默认方法有重名的，必须重写一次
//        存在同名的静态方法不会冲突，因为只能通过接口名去访问静态方法
//        当一个类既继承了一个父类，又实现了多个接口，父类中的成员方法与接口中默认方法重名，子类就近执行父类的成员方法
//接口的多继承： 一个接口可以继承多个接口
//             如果父接口中默认方有重名的，那么子接口需要重写一次
//其他成员特点：接口中，无法定义成员变量，但是可以定义常量，其值不可以改变，默认使用public static final修饰
//             没有构造方法，所以不能创建对象，也就是不能被new
//             没有静态代码块

    @Override
    public void shouYang() {
    }

    @Override
    public void eat() {
        System.out.println("Dog 在造狗粮");
    }

    @Override
    public void show() {
        System.out.println("show()重写");
    }

    @Override
    public void method() {
        System.out.println("Dog");
    }
}
