package com.sun.date_;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String s1 = dateTimeFormatter.format(now);
        LocalDateTime localDateTime = now.plusDays(13);
        String s2 = dateTimeFormatter.format(localDateTime);
        System.out.println("现在是" + s1 + "\n13天后是" + s2);

        LocalDateTime localDateTime1 = now.minusMinutes(3600);
        System.out.println("3600分钟之前的日期是"
                + dateTimeFormatter.format(localDateTime1));

    }
}
