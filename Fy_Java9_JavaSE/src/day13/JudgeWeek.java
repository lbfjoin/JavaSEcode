package day13;

import java.util.Calendar;

/**
 * @author lbf
 * @date 2020/7/31 8:15
 */
public class JudgeWeek {
    //用程序判断2018年2月14日是星期几
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.YEAR,2020);
        calendar.set(calendar.MONTH,7);
        calendar.set(calendar.DAY_OF_MONTH,31);
        System.out.println(calendar.get(calendar.YEAR) + ":" + calendar.get(calendar.MONTH) + ": "+
                calendar.get(calendar.DAY_OF_MONTH)+":"+(calendar.get(calendar.WEEK_OF_MONTH)-1));
    }
}
