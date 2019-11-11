package com.problems.hackerrank;

public class SockMerchant {

    public static void main(String[] args) {
//        int[] socks = {3, 4, 3, 4, 4, 5, 6, 8, 7, 8};
        int[] socks = {100};
        int result = sockMerchant(1, socks);
        System.out.println(result);
    }

    private static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        int[] socks = new int[101];
        for (int i = 0; i < n; i++) {
            socks[ar[i]]++;
            if (socks[ar[i]] == 2) {
                pairs++;
                socks[ar[i]] = 0;
            }
        }
        return pairs;
    }
}
