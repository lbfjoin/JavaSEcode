package com.company;

/**
 * @author lbf
 * @date 2020/5/31 20:06
 * 类封装了 成员变量、成员方法、构造函数
 * 数据类型：
 * 1.引用数据类型:接口、类、数组
 * 2.基本数据类型：byte\short\int\long\float\double\char\boolean
 */
public class JieKou {
    /* （特点：抽象方法使用abstract修饰，可以省略，没有方法体，该方法供子类实现使用）接口（interface） ：
                            一.概述：Java中的一种引用类型，是方法的集合
                            二.接口主要封装了方法   JDK1.7及以前 包含抽象方法
                                               JDK8  默认方法和静态方法
                                               JDK9  私有方法
                           三.定义：与类定义相似，使用interface修饰，也会编译成.class文件，但是接口不是类，而是另外一种引用数据类型
                                   使用：不能被创建，但是可以被实现（implements,类似于extends） 一个接口可以多实现
                                   一个实现接口的子类需要实现接口所有的抽象方法，否则它就必须是一个抽象类
                           四.类与接口是实现关系，类实现接口，该类成为接口的实现类，也可以称为接口的子类，使用implements关键字  格式：public class B implements A {
                                                                                                                                //重写所有的抽象方法【必须】
                                                                                                                                 ///重写默认方法【可选】
                                                                                                                                 }
      格式：
           public interface 接口名 {
               //抽象方法
               public abstract void method();
                 //默认方法 使用default修饰，不可以省略
                //功能是供子类调用或者子类重写
                   public default void method(){
                     //执行语句
                 }
                //静态方法 使用static修饰，供接口直接调用
                   public static void method2(){
                    //执行语句
                     }
               //含有私有方法和私有静态方法 ： 使用private修饰，供接口中的默认方法或者静态方法调用
                            private void method(){
                                     }
  静态方法的使用：


  */


}
