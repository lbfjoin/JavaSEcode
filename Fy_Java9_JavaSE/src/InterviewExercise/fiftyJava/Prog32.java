package InterviewExercise.fiftyJava;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/31 8:14
 */
public class Prog32 {
    //取一个整数a从右端开始的4～7位。
    //程序分析：可以这样考虑：
    //(1)先使a右移4位。
    //(2)设置一个低4位全为1,其余全为0的数。可用~(~0<<4)
    //(3)将上面二者进行&运算。
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个长整数");
        long num = scanner.nextLong();
        String num1 = num + "";
        char[] array = num1.toCharArray();
        if (array.length < 7) {
            System.out.println("输出的整数小于7位,请重新输入");
        } else {
            for (int i = array.length - 7; i < array.length - 3; i++) {
                System.out.print(array[i]);
            }
        }
    }
}
