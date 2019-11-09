package com.problems.hackerrank;

import java.math.BigInteger;

public class BigSort {

    public static void main(String[] args) {
        String[] nums = {"23", "322222222223333", "23234234", "5"};
        String[] sorted = bigSorting(nums);
        for (String s : sorted)
            System.out.print(s + ",");


    }

    private static String[] bigSorting(String[] unsorted) {
        int len = unsorted.length;
        for (int i = 0; i < len - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < len; j++) {
                if (unsorted[j].length() < unsorted[min_index].length()) {
                    min_index = j;
                }
                else if (unsorted[j].length() == unsorted[min_index].length()) {
                    BigInteger first = new BigInteger(unsorted[j]);
                    BigInteger second = new BigInteger(unsorted[min_index]);
                    if(first.compareTo(second) < 0 ){
                        min_index = j;
                    }
                    /*int chLen = unsorted[j].length();
                    for (int k = 0; k < chLen; k++) {
                        if (unsorted[j].charAt(k) < unsorted[min_index].charAt(k)) {
                            min_index = j;
                            break;
                        } else if (unsorted[j].charAt(k) > unsorted[min_index].charAt(k)) {
                            break;
                        }
                    }*/
                }
            }
            swap(unsorted, i, min_index);
        }
        return unsorted;
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
