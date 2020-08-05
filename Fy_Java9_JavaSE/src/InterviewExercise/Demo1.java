package InterviewExercise;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/7/31 19:28
 */
public class Demo1 {
    //题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
    //程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println(count(month));


    }
    public static int count(int month){
//            if(month ==1 || month ==2)
//                return 1;
//            else
//                return count(month-1)+count(month-2);
        //使用三目运算符
        int count = (month <= 2) ?  1 :  count(month-1) + count(month -2);
     return count;

    }



}
