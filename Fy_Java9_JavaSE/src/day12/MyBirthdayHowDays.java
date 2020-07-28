package day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/7/27 16:31
 */
public class MyBirthdayHowDays {
    public static void main(String[] args) throws ParseException {
        function();
    }

    public static void function() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您旁边伙伴的出生日期  格式 yyyy-MM-dd");
        String s = scanner.next();
        Date currentDate = new Date();
        //s转化为date对象
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(s);
        //1.获取当前时间对应的毫秒值
       long now =  currentDate.getTime();
        //2.获取出生时间对应的毫秒值
        long birth = date.getTime();

        //3.相减
         long day = now - birth ;
         if (day < 0){
             System.out.println("你还没出生");
         }else {
            long result = day / 1000/3600/24;
             System.out.println(result);
         }
    }

}
