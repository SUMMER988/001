package com.sun.arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Test99
 * Description:
 * date: 2022/3/17 17:15
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
@SuppressWarnings({"all"})
public class Test99 {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("index = " + index);

        Integer[] newArr = Arrays.copyOf(arr, arr.length);
        // System.out.println(Arrays.toString(newArr));

        Integer[] num = new Integer[]{9, 3, 2};
        Arrays.fill(num, 99);
        System.out.println(Arrays.toString(num));
        Integer[] arr2 = {1, 3, 5, 7, 9};
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println(equals);
        List<Integer> asList = Arrays.asList(2, 3, 4, 5);
        System.out.println("asList = " + asList);
        Integer integer = new Integer(2);
        asList.add(integer);
        for (Integer value : asList) {
            System.out.print(value);
        }
    }
}
