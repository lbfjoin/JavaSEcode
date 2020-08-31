package InterviewExercise.fiftyJava;

import com.alibaba.druid.support.json.JSONUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/27 10:56
 */
public class Prog34 {
    //输入3个数a,b,c，按大小顺序输出。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数");
        int c = scanner.nextInt();
        orderBy(a,b,c);
    }

    public static void orderBy(int a, int b, int c) {
        int flag = 0;
        flag = a > b ? a : b;
        int max = 0;
        max = flag > c ? flag : c;
        int min = 0;
        if (max == a){
            if (flag == b){
                min = c;
            }else if (flag == c){
                min = b;
            }
        }
        if (max == b){
            if (flag == a){
                min = c;
            }else if (flag == c){
                min = a;
            }
        }
        if (max == c){
            if (flag == a){
                min = b;
            }else if (flag == b){
                min = a;
            }
        }
        System.out.println(max + ","+ flag + "," + min);
    }


}