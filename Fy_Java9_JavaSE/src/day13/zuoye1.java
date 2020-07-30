package day13;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/28 18:39
 */
public class zuoye1 {
    public static void main(String[] args) {
        //给定以下代码，请定义方法listTest()统计集合中指定元素出现的次数，如"a": 2,"b": 2,"c" :1, "xxx":0。
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:" + listTest(list,"a"));
        System.out.println("b:" + listTest(list,"b"));
        System.out.println("c:" + listTest(list,"c"));

    }
    public static int listTest(ArrayList<String> list, String string){
        int count = 0;
        for (String str:list){
            if (str.equals(string)){
                count++;
            }
        }
        return count;
    }
}
