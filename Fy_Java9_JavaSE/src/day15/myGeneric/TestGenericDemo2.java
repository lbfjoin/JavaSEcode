package day15.myGeneric;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/30 9:21
 */
//public class TestGenericDemo2 {
//    public static void main(String[] args) {
//        MyGenericMethod mgm = new MyGenericMethod();
//        //在调用方法时，确定泛型的类型
//        mgm.show("aaa");
//        mgm.show(123);
//        mgm.show(12.45);
//    }
//}
public class TestGenericDemo2 {
    public static void main(String[] args) {
        MyGenericImpl2<String> impl2 = new MyGenericImpl2<>();
        ArrayList<Object> list = new ArrayList<>();
        impl2.add("hehe");

    }
}
