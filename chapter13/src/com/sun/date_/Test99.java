package com.sun.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/17 21:03
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");

        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse = " + sdf.format(parse));

    }
}
