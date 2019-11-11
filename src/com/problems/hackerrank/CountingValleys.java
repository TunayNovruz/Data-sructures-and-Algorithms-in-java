package com.problems.hackerrank;

public class CountingValleys {

    public static void main(String[] args) {

        int res = countingValleys(12,"DDUUDDUUUDUD");
        int res2 = countingValleys(8,"UDDDUDUU");

        System.out.println(res);
        System.out.println(res2);


    }

    private static int countingValleys(int n, String s) {
        int valleys = 0;
        int seaLevel = 0;
        int prev = 0;
        char[] travel = s.toCharArray();
        for (int i = 0; i <n ; i++) {
            prev = seaLevel;
            if(travel[i] == 'U') seaLevel++;
            else seaLevel--;
            if(seaLevel == 0 && prev < 0){
                valleys++;
            }
        }

        return valleys;
    }
}
