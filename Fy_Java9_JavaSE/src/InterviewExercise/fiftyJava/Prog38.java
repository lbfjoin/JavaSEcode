package InterviewExercise.fiftyJava;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/26 18:53
 */
public class Prog38 {
    //写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        System.out.println("该字符串的长度为" + (array.length));
    }
//    public static void main(String[] args){
//        System.out.print("请输入一串字符：");
//        Scanner scan = new Scanner(System.in).useDelimiter("\\n");
//        String strIn = scan.next();
//        scan.close();
//        char[] ch = strIn.toCharArray();
//        System.out.println(strIn+"共"+(ch.length-1)+"个字符");
//    }
}
