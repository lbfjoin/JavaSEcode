package day10;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/7/24 8:55
 */
public class Demo2 {
    public static void main(String[] args) {
        //键盘录入一个字符串数据，统计出大写字母，小写字母，数字的个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = scanner.nextLine();
        int bigCount = 0;
        int samllCount = 0;
        int numberCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //对每个字符进行判断
            if (ch >= 'A' && ch <= 'Z' ){
                bigCount++;
            }else if (ch >= 'a' && ch <= 'z'){
                samllCount++;
            }else if (ch >= '0' && ch <= '9'){
                numberCount++;
            }else {
                System.out.println("非法字符");
            }

        }
        System.out.println("大写字符数" + bigCount);
        System.out.println("小写字符数" + samllCount);
        System.out.println("数字字符数" + numberCount);
    }
}
