package com.company;

/**
 * @author lbf
 * @date 2020/6/7 14:25
 * 接口的静态方法
 * 接口的私有方法 ： （私有方法和私有静态）
 *
 * 接口的多实现，Java中是单继承 多实现：一个类可以实现多个接口 ；一个类能继承一个父类同时实现多个接口
 *
 */
public class InterfaceTest {
    public static void main(String[] args) {
//        Animal animal = new Animal();
////        Animal.run(); //报错，无法继承方法，也无法调用
////        Liveable.run();//通过接口调用
//        animal.func();
//        Dog dog = new Dog();
//        dog.show();
        Dog dog = new Dog();
        dog.method();
    }
}
