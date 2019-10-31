package com.algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 45, 67, 68, 93};
        int foundIndex = search(nums, 0, nums.length - 1, 93);
        System.out.println(foundIndex);
    }

    private static int search(int[] nums, int start, int end, int n) {
        int mid = start + (end - start) / 2;
        if (n == nums[mid]) return mid;
        else if (n < nums[mid]) return search(nums, start, mid, n);
        else if (n > nums[mid]) return search(nums, mid + 1, end, n);
        else return -1; //eger tapilmarsa

    }
}
