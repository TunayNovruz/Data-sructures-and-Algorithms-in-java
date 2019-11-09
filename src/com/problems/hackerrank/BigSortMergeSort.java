package com.problems.hackerrank;

import java.math.BigInteger;

public class BigSortMergeSort {

    public static void main(String[] args) {
        String[] nums = {"23", "322222222223333", "23234234", "5"};
        String[] sorted = bigSorting(nums);
        for (String s : sorted)
            System.out.print(s + ",");

//        sort(nums, 0, nums.length - 1);
//        for (String s : nums)
//            System.out.print(s + ",");


    }

    private static String[] bigSorting(String[] unsorted) {
        sort(unsorted, 0, unsorted.length - 1);
        return unsorted;
    }

    private static void sort(String [] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }


    private static void merge(String[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String[] L = new String[n1];
        String[] R = new String[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {

            BigInteger left = new BigInteger(L[i]);
            BigInteger right = new BigInteger(R[j]);
            if ( left.compareTo(right) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
