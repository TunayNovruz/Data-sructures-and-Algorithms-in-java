package com.algorithms;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {3,4,5,7,1,9,2,0,6};
        sort(nums,0,nums.length-1);

        for(int num : nums){
            System.out.print(num+",");
        }
    }

    private static int pivot(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        arr[end] = arr[i];
        arr[i] = pivot;
        return i;
    }

    private static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int checkedPivot = pivot(arr, start, end);
            sort(arr, start, checkedPivot-1);
            sort(arr, checkedPivot + 1, end);
        }
    }

}
