package com.problems.hackerrank;

public class JumpingOnClouds {
    public static void main(String[] args) {
        int[] clouds = {0 ,0 ,0 ,1 ,0, 0};
        int res = jumpingOnClouds(clouds);
        System.out.println(res);
    }

    private static int jumpingOnClouds(int[] c) {
        int len = c.length;
        int step = 0;
        for (int i = 0; i < len - 1; ) {
            if (i + 2 < len && c[i + 2] == 0) {
                step++;
                i += 2;
            } else if (c[i+1] == 0) {
                step++;
                i++;
            } else {
                step = 0;
                break;
            }
        }
        return step;
    }
}
