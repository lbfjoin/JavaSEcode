package com.company;

/**
 * @author lbf
 * @date 2020/6/7 16:36
 */
public class DynamicTest {
    public static void main(String[] args) {
//        多态形式
//        Dog dog = new Dog();
//        格式：父类类型 对象名 = new 子类对象
//        Animal dog = new Dog();
//        dog.eat();
//        Animal cat = new Cat();
//        cat.eat();
        //限定类型 string int double 对象 泛型

        //多态的好处
        Dog dog = new Dog();
        Cat cat = new Cat();
        //调用showCatEat
//        showCatEat(cat);
//        showDogEat(dog);

        showAnimalEat(dog);
        showAnimalEat(cat);
    }



//    public static void showCatEat(Dog dog){
//        dog.eat();
//    }
//    public static void showDogEat(Cat cat){
//        cat.eat();
//    }
    public static void showAnimalEat(Animal animal){
        animal.eat();
    }
}
