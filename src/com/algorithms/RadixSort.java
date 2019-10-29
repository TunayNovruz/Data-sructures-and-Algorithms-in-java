package com.algorithms;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int[] nums = {5,10,15,16,105,107,203,16};
        radixSort(nums);

        for(int c: nums)
            System.out.print(c+",");
    }

    private static void radixSort(int[] nums) {
        int max = maximum(nums);
        int len = nums.length;
        for (int i = 1; 0 < max / i; i *= 10) {
            sort(nums, len, i);
        }
    }

    private static void sort(int[] arr, int n, int exp) {

        int[] output = new int[n];
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10 ;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    private static int maximum(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }
}
