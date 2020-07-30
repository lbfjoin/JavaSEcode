package day14.zuoye;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lbf
 * @date 2020/7/29 20:19
 */
public class Exercise {
    public static void main(String[] args) {
        //往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value。
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set){
            String value = entry.getValue();
            System.out.println(value);
        }
    }
}
