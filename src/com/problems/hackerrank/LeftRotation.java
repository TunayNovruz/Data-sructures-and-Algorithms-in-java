package com.problems.hackerrank;

public class LeftRotation {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] p  = rotLeft(nums,5);
        for (int num:p) {
            System.out.print(num +",");
        }
    }

    private static int[] rotLeft(int[] a, int d) {
        int len = a.length;
        int[] newA = new int[len];
        for (int i = 0; i <len ; i++) {
            int reIndex = (i +d) >= len ? ( len - (i+d) ): (i+d);
            reIndex = reIndex < 0 ? ( reIndex*(-1)): reIndex;
            newA[i] = a[reIndex];
        }
        return newA;
    }
}
