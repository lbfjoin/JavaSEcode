package InterviewExercise.fiftyJava;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/25 20:34
 */
public class Prog39 {
    //编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,
    // 当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = scanner.nextInt();
        if (num % 2 == 0){
           ouShu(num);
        }else {
            jiShu(num);
        }

    }
    public static void ouShu(int num){
        double flag = 0;
        for (int i = 2; i <= num; i+=2) {
               flag += 1.0/i;  //记得是1.0不是1 否则结果为0

        }
        System.out.println(flag);
    }
    public static void jiShu(int num){
        double flag =0;
        for (int i = 1; i <= num; i+=2) {
            flag += 1.0/i;               //记得是1.0不是1 否则结果为0
        }
        System.out.println(flag);
    }

}
