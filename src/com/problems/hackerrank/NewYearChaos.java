package com.problems.hackerrank;

public class NewYearChaos {

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 3, 4};
//        int[] nums = {4,2,3,1, 5,1};
        minimumBribes(nums);
    }

    static void minimumBribes(int[] q) {
        int len = q.length;
        int[] swapped = new int[len+1];
        int swapCount = 0;
        outerloop:
        for (int j = 0; j < len; j++) {
            for (int i = j; i < len; i++) {
                if (q[j] > q[i]) {
                    swapped[q[j]]++;
                    int temp = q[i];
                    q[i] = q[j];
                    q[j] = temp;
                    swapCount++;
                }
                if (swapped[q[j]] > 2) {
                    System.out.println("Too chaotic");
                    swapCount = 0;
                    break outerloop;
                }
            }
        }
        if (swapCount > 0) System.out.println(swapCount);
    }

}
