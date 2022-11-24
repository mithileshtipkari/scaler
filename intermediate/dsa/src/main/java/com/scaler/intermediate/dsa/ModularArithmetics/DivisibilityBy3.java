package com.scaler.intermediate.dsa.ModularArithmetics;

public class DivisibilityBy3 {
    public int solve(int[] A) {
        int n = A.length;
        if(n>=1 && n<=100000){
            int sum =0;
            for(int i=0; i<n; i++){
                if(A[i]>=0 && A[i]<=9){
                    sum = sum + A[i];
                } else {
                    return -1;
                }
            }
            if(sum % 3 == 0){
                return 1;
            } else {
                return 0;
            }
        }
        return -1;
    }
}
