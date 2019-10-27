package com.algorithms;

public class InsertionSort {
    public static void main(String[] args) {

        int[] nums = {5, 6, 2, 4, 3, 1, 8, 9};
        int[] sortedNums = sort(nums);
        for (int sortedNum : sortedNums) {
            System.out.print(sortedNum + ",");
        }

    }

    private static int[] sort(int[] nums) {

        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int temp = nums[i];
            int j = i - 1;
            while (j >= 0 && temp < nums[j]) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = temp;
        }

        return nums;
    }

    //My alternative way
    private static int[] mySort(int[] nums) {
        int count = nums.length;

        for (int i = 1; i < count; i++) {
            int temp = nums[i];
            int j = i - 1;
            boolean shifted = false;
            for (; j >= 0; j--) {
                if (temp < nums[j]) {
                    nums[j + 1] = nums[j];
                    shifted = true;
                } else {
                    break;
                }
            }
            if (shifted) nums[j + 1] = temp;
        }

        return nums;
    }
}
