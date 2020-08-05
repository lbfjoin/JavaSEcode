package day14.exercise;

import java.util.Map;
import java.util.Set;

/**
 * @author lbf
 * @date 2020/8/3 7:45
 */
public class HashMap<S, S1> {
    public static void main(String[] args) {
        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("吕布", "貂蝉");
        map.put("孙策", "大乔");
        map.put("周瑜", "二乔");
        map.put("刘备", "甘夫人");
        map.put("安琪拉","亚瑟");
        System.out.println(map);
        map.remove("安琪拉");
        System.out.println(map);
        map.put("刘备","孙尚香");
        System.out.println(map);
        System.out.println(map.get("吕布"));

        for (String person:map.keySet()){
            String s = map.get(person);
            System.out.println(s + "和" + person);
        }
        System.out.println("=================");
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String,String> entry: set){
            String value = entry.getValue();
            String key = entry.getKey();
            System.out.println(key + "he" + value);
        }

    }

}
