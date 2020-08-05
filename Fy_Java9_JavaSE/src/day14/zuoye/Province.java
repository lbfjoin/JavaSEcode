package day14.zuoye;

import java.util.*;

/**
 * @author lbf
 * @date 2020/7/30 8:34
 */
public class Province {
    //方法二
    //    public static void main(String[] args) {
//        //有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
//        // 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
//        // 如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        Collections.addAll(list1,"黑龙江省","浙江省","江西省","广东省","福建省");
//        Collections.addAll(list2,"哈尔滨","杭州","南昌","广州","福州");
//        HashMap<String, String> map = new HashMap<>();
//        for (int i = 0; i < list1.size(); i++) {
//
//            for (int i1 = 0; i < list2.size(); i++) {
//                map.put(list1.get(i),list2.get(i1));
//
//            }
//
//        }
//        System.out.println(map);
//    }
    //方法二
    public static void main(String[] args) {
        // 1.定义第一个数组arr1
        String[] arr1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
// 2.定义第二个数组arr2
        String[] arr2 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};

// 3.创建HashMap,key存放省,value存放市
        HashMap<String, String> hm = new HashMap<>();

// 4.使用普通for循环遍历arr1
        for (int i = 0; i < arr1.length; i++) {
// 5.根据索引到arr1中获取到省
            String key = arr1[i];
// 6.根据索引到arr2中获取到省会城市
            String value = arr2[i];

// 7.将省和省会城市添加到HashMap中
            hm.put(key, value);
        }
// 8.输出HashMap中的内容
        System.out.println(hm);
    }
}


