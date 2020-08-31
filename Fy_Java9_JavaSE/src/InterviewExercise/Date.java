package InterviewExercise;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/16 9:52
 */
public class Date {
    public static void main(String[] args) {
        //题目：输入某年某月某日，判断这一天是这一年的第几天？
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入日子");
        int day = scanner.nextInt();
        judgeDay(year, month, day);


    }

    public static void judgeDay(int year, int month, int day) {
        int count = 0;
        int total = 0;
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month > 12) {
            System.out.println("输入的月份有误");
        }
        else if (day > arr[month]){
            System.out.println("输入的日期有误");
        }

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (month == 1) {
                    total = day;
                } else if (month == 2) {
                    for (int i = 0; i < month - 1; i++) {
                        count += arr[i];
                    }
                    total = count + day;
                } else if (month > 2 && month <= 12) {
                    for (int i = 0; i < month - 1; i++) {

                        count += arr[i];
                    }
                    total = count + day + 1;
                }

            } else {
                if (month == 1) {
                    total = day;
                } else {
                    for (int i = 0; i < month - 1; i++) {
                        count += arr[i];
                    }
                    total = count + day;
                }

            }
            System.out.println(year + "年" + month + "月" + day + "日" + "是今年的" + total + "天");

        }


}
