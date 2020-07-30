package day14;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/7/29 10:59
 */
public class MapTest {
    public static void main(String[] args) {
        // djhjsadljdjgl212214  统计上面字符串出现的字数
        System.out.println("请输入一个字符串");
        String line = new Scanner(System.in).nextLine();
        judge(line);


    }
    public static void judge(String line ){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                Integer count = map.get(c);
                map.put(c,++count);
            }

        }
        System.out.println(map);
    }
}
