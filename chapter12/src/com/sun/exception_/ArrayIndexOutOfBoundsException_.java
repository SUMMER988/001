package com.sun.exception_;

/**
 * ClassName: ArrayIndexOutOfBoundsException_
 * Description:
 * date: 2022/3/14 0:39
 *
 * @author sun
 * @version 1.0.0
 * @since JDK 1.8
 */
public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
