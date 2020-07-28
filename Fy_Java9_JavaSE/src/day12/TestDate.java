package day12;

import java.util.Date;

/**
 * @author lbf
 * @date 2020/7/27 15:13
 */
public class TestDate {
    public static void main(String[] args) {
        //创建日期对象，返回当前时间
        //Mon Jul 27 15:18:56 CST 2020
        System.out.println(new Date());
        //创建日期对象，把当前的毫秒值转化成日期对象
//        Thu Jan 01 08:00:00 CST 1970
        System.out.println(new Date(0L));
        //把日期对象转换为对应的时间毫秒值
        System.out.println(new Date().getTime());
        int i = 0;
        while (true){
            if (i == 1000000000){
                break;
            }
            i++;
        }
        System.out.println(new Date().getTime());

    }
}
