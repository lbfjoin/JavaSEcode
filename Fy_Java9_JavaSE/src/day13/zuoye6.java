package day13;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/28 19:20
 */
public class zuoye6 {
    public static void main(String[] args) {
//        定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(listTest(list,9));

    }
    public static int listTest(ArrayList<Integer> list , Integer s){
        for (int i = 0; i < list.size(); i++) {
            if (s.equals(list.get(i))){
                return i;
            }

        }
        return -1;
    }
}
