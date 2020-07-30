package day15.myGeneric;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lbf
 * @date 2020/7/30 9:59
 */
public class TestGenerciDemo4 {
    public static void main(String[] args) {
        //现在已知Object类、String类、Number类、Integer类，其中Number类是Integer的父类
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();
        getElement1(list1);
//        getElement1(list2);//报错
        getElement1(list3);
//        getElement1(list4);//报错

//        getElement2(list1);//报错
//        getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);
    }

    //泛型的上限 此时泛型？ 必须是Numbr类型或者Number类型子类
    public static void getElement1(Collection<? extends Number> coll){

    }

    //泛型下限 此时泛型？ 必须是Numbr类型或者Number类型父类
    public static void getElement2(Collection<? super Number> coll){

    }
}
