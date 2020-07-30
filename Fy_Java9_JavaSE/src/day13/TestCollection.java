package day13;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lbf
 * @date 2020/7/28 14:48
 */
public class TestCollection {
    public static void main(String[] args) {
        //使用多态形式创建集合对象
        Collection<String> coll = new ArrayList<>();
        //add
        coll.add("小鲁班");
        coll.add("后羿");
        coll.add("安琪拉");
        System.out.println(coll);
        // contain(E e);判断集合中是否包含给定的元素
        System.out.println(coll.contains("小鲁班")); //true
        System.out.println(coll.contains("王昭君"));//false
        // remove(E e);把给定的对象元素e从集合中删除
        System.out.println(coll.remove("小鲁班")); //true
        System.out.println("删除之后" + coll);
        // isEmpty();判断当前集合是否为空
        System.out.println(coll.isEmpty()); //false
        // size();返回集合中元素的个数
        System.out.println(coll.size()); //2
//        Object [ ] toArray();把集合中的元素返回为Object[ ]类型的数组
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + "\t");
        }
        System.out.println();
        //clear() 清空集合中所有的元素
        coll.clear();
        System.out.println(coll);


    }
}
