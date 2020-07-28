package day12;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lbf
 * @date 2020/7/27 17:04
 */
public class Exercise2 {
    public static void main(String[] args) {
        //2、请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String format = df.format(date);
        System.out.println(format);
    }

}
