package day15.myGeneric;

/**
 * @author lbf
 * @date 2020/7/30 9:21
 */
public class TestGenericDemo2 {
    public static void main(String[] args) {
        MyGenericMethod mgm = new MyGenericMethod();
        //在调用方法时，确定泛型的类型
        mgm.show("aaa");
        mgm.show(123);
        mgm.show(12.45);
    }
}
