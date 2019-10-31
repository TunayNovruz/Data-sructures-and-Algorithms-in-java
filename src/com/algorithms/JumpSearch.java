package com.algorithms;

public class JumpSearch {
    public static void main(String[] params) {
        int[] nums = {1,2,4,6,7,9,23,45,67,89,123};
        int foundIndex = search(nums,89);
        System.out.println(foundIndex);
    }

    private static int search(int[] nums, int x) {
        int len = nums.length;
        int counter = (int) Math.sqrt(len);
        int step = counter;
        int prev = 0;
        while(step<len && nums[step - 1] < x) {
            prev = step;
            step += counter;
        }
        while(prev<len && nums[prev] < x) prev++;
        if (prev<len && nums[prev] == x) return prev;
        return -1;
    }

}
