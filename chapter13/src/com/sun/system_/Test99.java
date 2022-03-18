package com.sun.system_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/17 18:55
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
        int num = 0;
        String str = "";
        while (num < 50000) {
            str += "你好";
            num++;
        }
        date = new Date();
        System.out.println(simpleDateFormat.format(date));
    }

}
