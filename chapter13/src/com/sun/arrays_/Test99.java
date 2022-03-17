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
        int[] arr = {1, 9, 5, 4, 8};

        bubbleSort02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer) o1 - (Integer) o2;
            }
        });
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort01(int[] arr) {
        int tempPos = 0;
        int lastPos = arr.length - 1;
        int count = 0;
        int tempNum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < lastPos; j++) {
                if (arr[j] > arr[j + 1]) {
                    tempNum = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempNum;
                    flag = true;
                    tempPos = j;
                }
            }
            count++;
            lastPos = tempPos;
            System.out.println(Arrays.toString(arr));
            if (flag == false) {
                System.out.println("总次数为" + count);
                break;
            }
        }

    }
    public static void bubbleSort02(int[] arr, Comparator c) {
        int tempPos = 0;
        int lastPos = arr.length - 1;
        int count = 0;
        int tempNum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < lastPos; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    tempNum = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempNum;
                    flag = true;
                    tempPos = j;
                }
            }
            count++;
            lastPos = tempPos;
            System.out.println(Arrays.toString(arr));
            if (flag == false) {
                System.out.println("总次数为" + count);
                break;
            }
        }

    }
}
