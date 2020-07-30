package day13;

import java.util.Calendar;

/**
 * @author lbf
 * @date 2020/7/28 8:57
 */
public class TestCalendar2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //设置年
        int year = calendar.get(Calendar.YEAR);
        //设置月
        int month = calendar.get(Calendar.MONTH) + 1;
        //设置日
        int day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(year + "月" + month + "月" + day + "日");  //2020月7月28日

        calendar.set(Calendar.YEAR,1998);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println("set之后");
        System.out.println(year + "月" + month + "月" + day + "日");  //1998月7月28日

    }
}
