package com.scaler.intermediate.dsa.contest1;

public class Vowels {
    public int[] solve(String A, int[][] B) {
        // System.out.println("B len -" + B.length);
        int[] ans = new int[B.length];
        int n = A.length();
        if(n>=1 && n<= 100000 && B.length >= 1 && B.length <= 100000){
            // System.out.println("string is fine");
            for(int q=0; q<B.length; q++){ //
                // System.out.println("query --------------------- " + q);
                int count = 0;
                int s = B[q][0], e = B[q][1]; //read B array, queries
                // System.out.println("s -" + s);
                // System.out.println("e -" + e);
                //iterate on string from s to e
                while(e>=s){
                    if(isVowel(A.charAt(s))) count++;
                    s++;
                }
                // System.out.println("count for query -" + count);
                //add vowel count in ans array
                ans[q] = count;
            }

        }
        return ans;
    }

    public boolean isVowel(char c){
        // System.out.println("isVowel called for -" + c);
        if(c == 'a') return true;
        if(c == 'e') return true;
        if(c == 'i') return true;
        if(c == 'o') return true;
        if(c == 'u') return true;
        return false;
    }
}
