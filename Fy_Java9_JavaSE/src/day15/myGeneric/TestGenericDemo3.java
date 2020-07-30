package day15.myGeneric;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lbf
 * @date 2020/7/30 9:49
 */
public class TestGenericDemo3 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<Integer> list2 = new ArrayList<>();
        getElement(list1);
        getElement(list2);
    }
    public static void getElement(Collection<?> coll){
            //<?>可以接收任意类型
    }
}
