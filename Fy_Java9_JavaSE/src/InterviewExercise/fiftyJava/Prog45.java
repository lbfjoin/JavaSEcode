package InterviewExercise.fiftyJava;

import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/20 21:28
 */
public class Prog45 {
    //判断一个素数能被几个9整除

        public static void main(String[] args){
            System.out.print("请输入一个数：");
            Scanner scan = new Scanner(System.in);
            long l = scan.nextLong();
            long n = l;
            scan.close();
            int count = 0;
            while(n>8){
                n /= 9;
                count++;
            }
            System.out.println(l+"能被"+count+"个9整除。");
        }
    }


