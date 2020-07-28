package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author lbf
 * @date 2020/7/28 9:23
 */
public class TestCalendar5 {
    public static void main(String[] args) throws ParseException {
        //calendar.getActualMaximum();//获取给定日历的最大可能值
        //方法（2020-06）
        String lastDayOfMonth = getLastDayOfMonth("2020-06");
        System.out.println(lastDayOfMonth);
        int las = lastDay(2020, 11);
        System.out.println(las);

    }

    //编写一个方法，根据给定的字符串yyyy-MM获取当月的最后一天
    //方法 （String yearmonth)
    public static String getLastDayOfMonth(String yearMonth) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
        Date date = df.parse(yearMonth);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        return " " + lastDay;
    }

    public static int lastDay(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();//清除所有日期数据
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastDay;
    }
}
