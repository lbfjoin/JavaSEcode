package day14.zuoye;

import java.util.HashMap;

/**
 * @author lbf
 * @date 2020/7/30 8:28
 */
public class NameRemove {
    public static void main(String[] args) {
        //要求：
        //1.遍历集合，并将序号与对应人名打印。
        //2.向该map集合中插入一个编码为5姓名为李晓红的信息
        //3.移除该map中的编号为1的信息
        //4.将map集合中编号为2的姓名信息修改为"周林"
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        for (Integer i: map.keySet()){
            System.out.println(i + ":"+map.get(i));
        }
        map.put(5,"E");
        System.out.println(map);
        map.remove(1);
        map.put(2,"b");
        System.out.println(map);
    }
}
