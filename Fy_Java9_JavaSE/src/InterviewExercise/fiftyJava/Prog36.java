package InterviewExercise.fiftyJava;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/26 21:16
 */
public class Prog36 {
    //有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组的个数");
        int n = scanner.nextInt();
        System.out.println("请输入想要移动的数字个数");
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;

        }
        System.out.println("原来的数组为：");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
        System.out.println("改变后的数组为：");
        changeArr(m,arr);

    }

    public static void changeArr(int m, int[] arr) {
        int flag = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            flag = arr[i];
            arr[i] = arr[arr.length - m + count];
            arr[arr.length - m + count] = flag;
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
