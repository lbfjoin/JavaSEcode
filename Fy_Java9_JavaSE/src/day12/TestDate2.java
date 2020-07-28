package day12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lbf
 * @date 2020/7/27 15:57
 */
public class TestDate2 {
    public static void main(String[] args) {
//        格式化：按照指定格式，从Date对象转换为String对象。
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(date);
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = df.format(date);
        System.out.println(str);





    }
}
