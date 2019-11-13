package com.problems.hackerrank;

public class Hourglass {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},

        };
        int result = hourglassSum(nums);
        System.out.println(result);
    }

    private static int hourglassSum(int[][] arr) {
        int max = -63;
        int height = arr.length;
        int width = arr[0].length;

        if (height < 3 || width < 3) return max;

        for (int i = 0; i < height - 2; i++) {
            for (int j = 0; j < width - 2; j++) {
                int hourGlass =
                        arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                                + arr[i + 1][j + 1] +
                                arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                if (hourGlass > max) {
                    max = hourGlass;
                }
            }
        }

        return max;
    }
}
