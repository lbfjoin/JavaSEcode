package InterviewExercise.fiftyJava;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/23 18:20
 */
public class Prog44 {
    //一个偶数总能表示为两个素数之和。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个偶数");
        int num = scanner.nextInt();
        sum(num);

    }

    public static void sum(int num) {
        for (int i = 0; i < num/2 + 1; i++) {
            if (judgeNum(i) && judgeNum(num - i)) {
                System.out.println(num + "=" + i + "+" + (num - i));
            }
        }
    }

    public static boolean judgeNum(int jnum) {
        boolean flag = true;
        for (int i = 2; i < jnum / 2 + 1; i++) {
            if (jnum % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
