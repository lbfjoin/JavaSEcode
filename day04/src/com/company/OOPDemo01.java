package com.company;

/**
 * @author lbf
 * @date 2020/4/26 18:28
 * 面向对象编程
 * 对象：泛指现实中一切的事物，每个事物都有自己的【属性】和【行为】
 * 面向对象强调：通过调用对象的行为去实现功能，而不是自己去一步一步实现
 * 举例：
 * 洗衣服：
 * 面向过程：把衣服脱掉 --》找盆--》洗衣粉--》加水--》泡一下--》搓搓搓--》拧干--》晾起来
 * 面向对象：把衣服托电--》打开全自动洗衣机--》扔衣服--》开关--》晾起来
 *
 * 面向过程：强调步骤
 * 面向对象：强调对象
 * 面向对象特点：将复杂的事情简单化，我们从执行者变成了指挥者
 * 面向对象包含三大基本特征：封装、继承、多态
 */
public class OOPDemo01 {
    /**
     * 类和对象
     * 什么叫类？
     * 类：可以看成一类事物的模板，在面向对象编程中，使用属性和行为来描述类
     * 在现实中：
     * 属性：该事物的状态信息
     * 行为：该事物能干什么
     *
     * 对象：是一类事物的具体体现
     * 对象是类的一个实例，对象就必然具备该类事物的属性和行为
     *
     * 举例：猫类
     * 属性： name:tom weigh:5kg  age:2 skin:black 行为：溜墙根走，蹦跶，喵喵叫  刘宝枫的一只猫（是一个实例也是一个对象）
     * 类与对象的关系：
     * 类是对一类事物的描述，抽象的
     * 对象是一类事物的实例，具体的
     * 类是对象的模板，对象是类的实体
     * Car()类 刘宝枫买了一辆奥迪—————》对象
     */
    /**
     * 类在Java中的定义
     * 现实中的一类事物
     * 属性：事物的状态信息  行为：事物能干什么
     * Java中和现实是一致的
     * 成员变量：对应事物的属性 ，成员的方法：对应事物的行为
     * 成员变量：和之前定义变量一样，只不过位置变了，在类中，在方法外
     * 成员方法：只不过我们要将以前的方法static去掉(static: 静态方法，静态方法中不能访问非静态成员方法和非静态成员变量，但是在非静态成员方法中是可以访问静态成员方法/变量）
     */
    public class 类名{
        //成员变量
        //成员方法
    }
}
