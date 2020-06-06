package com.company;

/**
 * @author lbf
 * @date 2020/5/31 16:15
 */
public class Cat extends Animal {
    private String name;
    //无参数的构造函数
    Cat() {
        super();
        System.out.println("Cat()");
    }
    Cat(String name) {
//        super();
        this();//本类的构造方法
        //super();
        // 1.子类中每个构造方法中均有super（）,用来调用父类空参构造
        //2.手动调用父类的构造会覆盖默认的super()
        //3.super()、this()必须在构造方法的第一行，所以两者不能同时出现
        this.name = name;
        System.out.println("Cat(name)");
    }
    @Override
    public void eat() {
        System.out.println("cat : eat");
    }
    public void eatTest(){
        this.eat();//this 调用本类的方法
        super.eat();//super调用父类的方法
    }
}
