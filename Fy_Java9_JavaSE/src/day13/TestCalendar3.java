package day13;

import java.util.Calendar;

/**
 * @author lbf
 * @date 2020/7/28 9:07
 */
public class TestCalendar3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(year + "月" + month + "月" + day + "日");  //2020月7月28日

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.YEAR, -3);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println("add之后");
        System.out.println(year + "月" + month + "月" + day + "日");  //2020月7月28日

    }
}
