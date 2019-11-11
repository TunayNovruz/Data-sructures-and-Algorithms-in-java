package com.problems.hackerrank;

public class kangroo {
    public static void main(String[] args) {
        String res = kangaroo(0,2,5,3);
        System.out.println(res);
        res = kangaroo(0,3,4,2);
        System.out.println(res);

        System.out.println(kangaroo(28,8,96,2));
    }
    private static String kangaroo(int x1, int v1, int x2, int v2) {
        double diff1 = (x2-x1);
        double diff2 = (v1-v2);
        if(diff2 <= 0) return "NO";
        double res = diff1/diff2;
        if(res%1 == 0){
            return "YES";
        }
        return "NO";
    }
}
