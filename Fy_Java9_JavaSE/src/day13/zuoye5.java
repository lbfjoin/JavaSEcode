package day13;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/28 19:16
 */
public class zuoye5 {
    public static void main(String[] args) {
        //定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        boolean b = listTest(list);
//        System.out.println(b);
        System.out.println(listTest(list));

    }
    public static boolean listTest(ArrayList<String> list){
        if (list.isEmpty()){
            return true;
        }else
            return false;
    }
}
