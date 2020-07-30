package day14;

import java.util.HashMap;

/**
 * @author lbf
 * @date 2020/7/29 8:41
 */
public class Demo {
    public static void main(String[] args) {
        //创建map对象
       HashMap<String, String> map = new HashMap<>();
       map.put("吕布","貂蝉");
       map.put("孙策","大乔");
       map.put("周瑜","小乔");
       map.put("刘备","孙尚香");
       //如果put 时间存在，那么会覆盖之前的的值
       map.put("刘备","甘夫人");
        System.out.println(map);
        //访问
        String s = map.get("刘备");
        String s2 = map.get("吕布");
        System.out.println(s);
        System.out.println(s2);
        //删除
        String remove = map.remove("孙策");
        System.out.println(remove);

        System.out.println(map.containsKey("刘备"));  //true
        System.out.println(map.containsKey("孙策"));//false
    }
}
