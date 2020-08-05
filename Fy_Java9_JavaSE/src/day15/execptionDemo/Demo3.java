package day15.execptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lbf
 * @date 2020/7/30 11:34
 */
public class Demo3 {
    public static void main(String[] args) throws ParseException {
        String s = "1994-01";
        timeFormat(s);
    }
    public static void timeFormat(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
