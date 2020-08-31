package InterviewExercise.fiftyJava;

import java.util.Random;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/20 21:14
 */
public class Prog47 {
    public static void main(String[] args) {
        //读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个1-50的整数");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个1-50的整数");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个1-50的整数");
        int num3 = scanner.nextInt();
        System.out.println("请输入第四个1-50的整数");
        int num4 = scanner.nextInt();
        System.out.println("请输入第五个1-50的整数");
        int num5 = scanner.nextInt();
        System.out.println("请输入第六个1-50的整数");
        int num6 = scanner.nextInt();
        System.out.println("请输入第七个1-50的整数");
        int num7 = scanner.nextInt();
        printShow(num1);
        printShow(num2);
        printShow(num3);
        printShow(num4);
        printShow(num5);
        printShow(num6);
        printShow(num7);

    }

    public static void printShow(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*" + "\t");
        }
        System.out.println();

    }
}
