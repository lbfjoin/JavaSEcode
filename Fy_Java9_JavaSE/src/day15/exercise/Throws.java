package day15.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lbf
 * @date 2020/8/2 19:21
 */
public class Throws {
    public static void main(String[] args) throws ParseException {
        String s = "2020-08-02";
        format(s);

    }
    public static void format(String s ) throws ParseException {
        SimpleDateFormat parse = new SimpleDateFormat("yyyy-MM-dd");
        Date date = parse.parse(s);
        System.out.println(date);


    }
}
