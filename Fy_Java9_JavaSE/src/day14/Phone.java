package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lbf
 * @date 2020/7/29 9:33
 */
public class Phone {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        String a = map.put("华为", "Mate30");
        String b = map.put("ViVo", "X11");
        String c = map.put("苹果", "11proMax");
        String d = map.put("小米", "redmi");
        System.out.println(map);

        String s = map.get("华为");
        String s1 = map.get("ViVo");
        System.out.println(s);
        System.out.println(s1);

        String remove = map.remove("ViVo");
        System.out.println(remove);

        boolean contains1 = map.containsKey("ViVo");
        boolean contains2 = map.containsKey("苹果");
        System.out.println(contains1);
        System.out.println(contains2);

        Set<String> keySet = map.keySet();
        for (String key:keySet){
            String s2 = map.get(key);
            System.out.println(key + s2);
        }
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry: entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
