package com.sun.map_;

class Solution {
    protected static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                int temp = 0;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
    protected static void printArr(int[] nums) {
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
