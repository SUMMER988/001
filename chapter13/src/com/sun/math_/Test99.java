package com.sun.math_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/17 16:24
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        Integer[] integers = {1, 7, 5, 3, 9};
        Arrays.sort(integers);
        System.out.println("排序后");
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(integers));
    }
}
