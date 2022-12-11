package com.scaler.intermediate.dsa.hashing;

import java.util.HashSet;

public class CountOfDistinctEle {
    public int solve(int[] A) {
        int n = A.length;
        HashSet<Integer> hs = new HashSet<>();
        if(n>=1 && n<=100000){
            for(int z=0; z<n; z++){
                if(A[z]>=1 && A[z]<=1000000000){
                    hs.add(A[z]);
                }
            }
            return hs.size();
        }
        return -1;
    }
}
