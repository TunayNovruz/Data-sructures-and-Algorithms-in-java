package com.algorithms;

public class BubbleSort {

    public static void  main(String[] args){
        int[]nums = {4,7,2,5,3,9,8,0,1};

        int [] sortednums= sort(nums);

        for (int sortednum:sortednums) {
            System.out.print(sortednum+",");
        }
    }

    private static int[] sort(int[] nums) {

        int count = nums.length;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
