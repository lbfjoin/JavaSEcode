package day15.exercise;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/8/2 18:21
 */
public class TestUnkownGeneric {
    public static void main(String[] args) {
        UnknownGeneric<String> generic = new UnknownGeneric<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        System.out.println(list);
    }
}
