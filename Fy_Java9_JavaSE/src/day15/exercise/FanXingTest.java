package day15.exercise;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lbf
 * @date 2020/8/2 18:24
 */
public class FanXingTest {
    public static void main(String[] args) {
        //举个例子：现在已知Object类、String类、Number类、Integer类，其中Number类是Integer的父类
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
//        getElement1(list1); //报错
//        getElement1(list2);//报错
        getElement1(list3);
        getElement1(list4);

        getElement2(list1);
//        getElement2(list2);//报错
        getElement2(list3);
//        getElement2(list4);//报错

    }
    //泛型上限，此时泛型必须是Number类和其子类
    public static void getElement1(Collection<? extends Number> coll){

    }
    //泛型下限，此时泛型必须是Number类和其父类
    public static void getElement2(Collection<? super Number> coll){

    }
}
