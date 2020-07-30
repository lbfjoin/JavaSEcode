package day13;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lbf
 * @date 2020/7/28 15:09
 */
public class TestIterator {
    public static void main(String[] args) {
        //使用多态形式创建集合
        ArrayList<String> coll = new ArrayList<>();
        coll.add("小鲁班");
        coll.add("后羿");
        coll.add("安琪拉");
        //遍历
        Iterator<String> iterator = coll.iterator();
        //iterator.hasNext()判断是否有迭代元素
        while (iterator.hasNext()){
            //获取迭代的元素
            String s = iterator.next();
            System.out.println(s);

        }
    }
}
