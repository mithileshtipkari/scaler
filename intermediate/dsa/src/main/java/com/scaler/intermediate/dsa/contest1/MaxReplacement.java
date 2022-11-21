package com.scaler.intermediate.dsa.contest1;

public class MaxReplacement {
    public int solve(int[] A, int B) {
        int opCount = 0;
        int n = A.length;
        boolean bFound = false;
        if(n >= 1 && n <= 100000){
            for(int i = 0; i<n; i++){ //n
                if(A[i] >= 1 && A[i] <= 1000000000){
                    if(A[i] == B){
                        bFound = true;
                    }
                    if(A[i] > B){
                        opCount++;
                    }
                }
            }
            if(bFound) return opCount;
        }
        return -1;
    }
}
