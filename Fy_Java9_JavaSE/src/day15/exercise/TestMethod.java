package day15.exercise;

import day15.myGeneric.MyGenericMethod;

/**
 * @author lbf
 * @date 2020/8/2 17:31
 */
public class TestMethod {
    public static void main(String[] args) {
        MyGenericMethod mgm = new MyGenericMethod();
        //在调用方法时，确定泛型的类型
        mgm.show("aaa");
        mgm.show(123);
        mgm.show(12.45);
    }
}
