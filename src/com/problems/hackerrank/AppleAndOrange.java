package com.problems.hackerrank;

public class AppleAndOrange {
    public static void main(String[] args) {
        int[] apples = {-2,2,1};
        int[] oranges = {5,-6};
        countApplesAndOranges(7,11,5,15,apples,oranges);
        countApplesAndOranges(17,21,15,25,apples,oranges);
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount = 0;
        for (int apple : apples) {
            if (a + apple <= t && a + apple >= s) appleCount++;
        }
        for (int orange : oranges) {
            if (b + orange <=t && b+orange >=s) orangeCount++;
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
