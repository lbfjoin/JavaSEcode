package day14.zuoye;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author lbf
 * @date 2020/7/30 8:34
 */
public class Province {
    public static void main(String[] args) {
        //有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
        // 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
        // 如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1,"黑龙江省","浙江省","江西省","广东省","福建省");
        Collections.addAll(list2,"哈尔滨","杭州","南昌","");

    }
}
