package com.sun.arrays_;

import java.util.Arrays;
import java.util.Comparator;

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
        int[] arr = {1, -1, 8, 0, 28};
        // bubble01(arr);
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return Integer.compare((Integer) o1, (Integer) o2);
            }
        });

        System.out.println(Arrays.toString(arr));

    }

    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;//标记是否发生交换
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;//标记是否发生交换
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

    }
}
