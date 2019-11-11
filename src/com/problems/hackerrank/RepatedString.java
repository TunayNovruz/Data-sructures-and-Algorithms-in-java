package com.problems.hackerrank;

public class RepatedString {

    public static void main(String[] args) {
        String word = "caaba";
        long n = 27;

        long res = repeatedString(word,n);
        System.out.println(res);
    }

    private static long repeatedString(String s, long n) {
        long countOfA  = 0 ;
        char[] letters = s.toCharArray();
        int len = letters.length;
        long countOfWord = n/len;
        long  carrier =   n%len;
        long countOfCarrierA = 0;

        for (int i =0 ; i<len;i++) {
            if (letters[i] == 'a') {
                countOfA++;
                if(carrier > 0 && i < carrier) countOfCarrierA++;
            }
        }

        countOfA = countOfA * countOfWord + countOfCarrierA;
        return  countOfA;

    }

}
