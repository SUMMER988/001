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

        Integer[] integer = {70, 20, 60};
        Arrays.sort(integer);
        System.out.println(Arrays.toString(integer));

        Integer[] arr = {1, 7, 5, 0, 9};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1;
            }
        });
        System.out.println("======调用定制排序后======");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1;
            }
        });
        System.out.println("======调用定制排序后======");
        System.out.println(Arrays.toString(arr));
    }

}
