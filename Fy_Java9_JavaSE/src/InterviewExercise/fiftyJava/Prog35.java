package InterviewExercise.fiftyJava;

/**
 * @author lbf
 * @date 2020/8/27 10:23
 */
public class Prog35 {
    //    输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8,5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = max < arr[i] ? arr[i] : max;
        }
        for (int i = 0; i < arr.length; i++) {
            min = min > arr[i] ? arr[i] : min;
        }
        System.out.println("原来的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("改变后的数组为：");
        exchange(max,min,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

    public static void exchange(int max,int min,int[] arr){
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max){
                flag = arr[0];
                arr[0] = max;
                arr[i] = flag;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min){
                flag = arr[arr.length-1];
                arr[arr.length-1] = min;
                arr[i] = flag;
            }
        }
    }
}
