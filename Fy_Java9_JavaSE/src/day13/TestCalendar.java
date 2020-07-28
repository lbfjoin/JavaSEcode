package day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @author lbf
 * @date 2020/7/28 8:41
 */
public class TestCalendar {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //设置年
        int year = calendar.get(Calendar.YEAR);
        //设置月
        int month = calendar.get(Calendar.MONTH) + 1;
        //设置日
        int day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(year + "月" + month + "月" + day + "日");

    }
}
