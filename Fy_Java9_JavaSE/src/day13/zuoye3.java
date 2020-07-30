package day13;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/28 18:55
 */
public class zuoye3 {
    public static void main(String[] args) {
        //定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
