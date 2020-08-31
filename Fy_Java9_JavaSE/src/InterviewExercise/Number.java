package InterviewExercise;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/6 21:07
 */
public class Number {
    public static void main(String[] args) {
        //有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入想要改变的位置数");
        int count = scanner.nextInt();

        int flag = 0;
        int emp = count;
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < count; i++) {
            arr[i] = arr1[arr1.length - count + flag];
            flag++;

        }
            for (int i1 = 0; i1 < arr1.length - emp; i1++) {
                arr[count] = arr1[i1];
                count++;
            }



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }

    }
}
