package day14;

import java.util.HashMap;
import java.util.Set;

/**
 * @author lbf
 * @date 2020/7/29 9:10
 */
public class Demo2 {
    public static void main(String[] args) {
        //创建map对象
        HashMap<String, String> map = new HashMap<>();
        map.put("吕布","貂蝉");
        map.put("孙策","大乔");
        map.put("周瑜","小乔");
        map.put("刘备","孙尚香");
        //获取所有的键
        Set<String> keys = map.keySet();
        //遍历所有的键
        for (String key: keys){
            String val = map.get(key);
            System.out.println(key + "和" + val + "是一对");
        }

    }
}
