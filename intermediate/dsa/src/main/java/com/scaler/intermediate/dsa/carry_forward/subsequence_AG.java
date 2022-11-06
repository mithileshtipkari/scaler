package com.scaler.intermediate.dsa.carry_forward;

import java.util.logging.Logger;

public class subsequence_AG {
    public static void main(String[] args) {
        int ans = solve("ABCGAG");
        System.out.println("ans -" + ans);
    }

    private static int solve(String A) {
        char[] arr = A.toCharArray();
        int N = A.length();
        int gCount = 0;
        int pairCount = 0;
        if(N >= 1 && N <= Math.pow(10,5)){
            for(int i = N-1 ; i >= 0; i--){//loop runs N times - N
                if(arr[i] == 'G')   gCount++;
                if(arr[i] == 'A')   pairCount = pairCount + gCount;
                pairCount = pairCount % 1000000007; //perform modulo in for loop itselfto avoid overflow
            }
        }
        return pairCount;
    }
}
//TC - O(N) - only one loop running N times
//SC - O(1) - const no of variable used
