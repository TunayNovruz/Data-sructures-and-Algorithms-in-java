package com.algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {8, 4, 0, 2, 9, 5, 6};
        int[] sortedNums = sort(nums);
        for (int sortedNum : sortedNums) {
            System.out.println(sortedNum);
        }

    }

    private static int[] sort(int[] arr) {
        int count = arr.length;
        int k = 0;
        for (int i = 0; i < count - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < count; j++)
                if (arr[j] < arr[min_index]) min_index = j;

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;
    }

}
