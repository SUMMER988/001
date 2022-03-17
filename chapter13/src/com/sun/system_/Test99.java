package com.sun.system_;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        Date date = new Date();
        //当前时间：Sat Mar 30 22:07:34 CST 2019
        System.out.println(date.toString());
        //当前时间：格式化输出24小时格式  2019-03-30 22:09:53
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf1.format(date));
        //当前时间：格式化输出12小时格式  2019-03-30 10:09:53
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf2.format(date));
        //当前时间：Sat Mar 30 22:07:34 CST 2019
        System.out.println(Calendar.getInstance().getTime());
        //当前时间：2019-3-30 22:09:54
        System.out.println(Calendar.getInstance().getTime().toLocaleString());
    }

}
