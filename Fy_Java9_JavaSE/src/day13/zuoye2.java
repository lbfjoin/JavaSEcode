package day13;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/28 18:47
 */
public class zuoye2 {
    public static void main(String[] args) {
        //定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。()
        int[] arr = {1, 2, 3, 5, 6, 7, 9};
        ArrayList<Integer> list = listTest(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println(list);
    }

    public static ArrayList<Integer> listTest(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : arr) {
            list.add(a);
        }
        return list;

    }
}
