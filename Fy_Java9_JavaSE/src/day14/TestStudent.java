package day14;

import java.util.HashMap;

/**
 * @author lbf
 * @date 2020/7/29 10:34
 */
public class TestStudent {


    public static void main(String[] args) {
        //创建map
        HashMap<Student, String> map = new HashMap<>();
        //添加元素
        map.put(new Student("刘能",34),"锦州");
        map.put(new Student("赵四",23),"葫芦岛");
        map.put(new Student("宋小宝",44),"大连");
        map.put(new Student("小沈阳",44),"营口");
        map.put(new Student("小沈阳",44),"营口");

        //遍历
        for (Student key:map.keySet()){
//            System.out.println(key);
            String val = map.get(key);
            System.out.println(key + "......" + val);
        }

    }
}
