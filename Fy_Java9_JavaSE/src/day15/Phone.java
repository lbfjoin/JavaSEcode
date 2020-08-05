package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lbf
 * @date 2020/7/30 18:20
 */
public class Phone {
    //用map集合存储多个手机对象和他的价格，使用增、删、改value、通过key输出值的信息（get）
    // 、获取map中全部的keys、values，使用entrySet方法并实现getKey、getValue方法
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("华为",10000);
        map.put("小米",20000);
        map.put("苹果",30000);
        map.put("ViVo",40000);
        System.out.println(map);
        map.remove("ViVo");
        System.out.println(map);
        System.out.println(map.containsKey("Vivo"));
        System.out.println(map.get("华为"));
        for (String phone:map.keySet()){
            System.out.println(phone);
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet ){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
