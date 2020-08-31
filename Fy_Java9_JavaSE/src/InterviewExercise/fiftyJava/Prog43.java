package InterviewExercise.fiftyJava;

/**
 * @author lbf
 * @date 2020/8/24 8:16
 */
public class Prog43 {
    //求0—7所能组成的奇数个数。
//    public static void main(String[] args) {
//        int ge = 0;
//        int shi = 0;
//        for (int i = 0; i < 8; i++) {
//
//        }
//    }
    public static void main(String[] args) {
        /*
         * 求0—7所能组成的奇数个数
         * 分析：在0-7中组成的数0不能开头所以数为一位数时奇数有1，3，5，7
         * 二位数时奇数有4*7
         * 三位数一直到8位数是前面奇数个数*8
         */
        //0到7有8个数，但是最高位是7位，0不能放在开头
        int count = 0, sum = 0;
        for (int i = 1; i < 9; i++) {
            if (i == 1)
                count = 4;
            else if (i == 2)
                count *= 7;
            else
                count *= 8;
            sum += count;
            System.out.println("0到7组成的" + i + "位奇数个数为" + sum);
        }
        System.out.print("总共的奇数个数为" + sum);
    }
}
