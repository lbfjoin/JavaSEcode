package day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lbf
 * @date 2020/7/27 17:04
 */
public class Exercise1 {
    public static void main(String[] args) throws ParseException {
        //1、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
        String s = "2018-03-04";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = df.parse(s);
        System.out.println(parse);
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = df1.format(parse);
        System.out.println(format);


    }
}
