package day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lbf
 * @date 2020/7/27 16:22
 */
public class TestDate3 {
    public static void main(String[] args) throws ParseException {
        //        解析：按照指定格式，从String对象转换为Date对象。
        String str = "2001年6月6日";
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = df.parse(str);
        System.out.println(date);
    }
}
