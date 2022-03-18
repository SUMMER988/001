package com.sun.date_;

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
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

    }
}
