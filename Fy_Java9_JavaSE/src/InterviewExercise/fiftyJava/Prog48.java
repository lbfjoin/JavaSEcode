package InterviewExercise.fiftyJava;

/**
 * @author lbf
 * @date 2020/8/20 8:11
 */
public class Prog48 {
    //某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
    // 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，
    // 再将第一位和第四位交换，第二位和第三位交换。
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = (arr[i] + arr[i] + 5) % 10;
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        int flag1 = 0;
        flag1 = arr2[3];
        arr2[3] = arr2[0];
        arr2[0] = flag1;
        int flag2 = 0;
        flag2 = arr2[2];
        arr2[2] = arr2[1];
        arr2[1] = flag2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + "\t");
        }


    }
}
