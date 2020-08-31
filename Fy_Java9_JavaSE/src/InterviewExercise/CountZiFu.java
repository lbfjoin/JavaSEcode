package InterviewExercise;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/7 19:35
 */
public class CountZiFu {
    public static void main(String[] args) {
        //输入一行字符，分别统计出其中汉字、英文字母、空格、数字和其它字符的个数
        System.out.println("请输入一串字符");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        CountZiFu.count(arr);

    }
    public  static  void count(char[] arr){
        int samll =0;
        int big = 0;
        int shuzi = 0;
        int hanzi = 0;
        int space = 0;
        int other = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])){
                shuzi++;
            }
            else if (Character.isSpaceChar(arr[i])){
                space++;
            }else if (arr[i] >= 'a' && arr[i]<'z'){
                samll++;
            }else if (arr[i] >= 'A' && arr[i]<'Z'){
                big++;
            }else if (Integer.toBinaryString(arr[i]).length() > 8){
                hanzi++;
            }else {
                other++;
            }


        }
        System.out.println();
        System.out.println("空格个数" + space);
        System.out.println("数字个数" + shuzi);
        System.out.println("小写字母个数" + samll);
        System.out.println("大写字母个数" + big);
        System.out.println("汉字个数" + hanzi);
        System.out.println("其他字符个数" + other);

    }
}
