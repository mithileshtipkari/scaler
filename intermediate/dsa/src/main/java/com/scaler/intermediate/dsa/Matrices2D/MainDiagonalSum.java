package com.scaler.intermediate.dsa.Matrices2D;

public class MainDiagonalSum {
    public int solve(final int[][] A) {
        int n = A.length;
        if(n>=1 && n<=1000){
            int sum = 0;
            for(int i=0; i<n; i++){
                if(A[i][i]>=-1000 && A[i][i]<=1000){
                    sum += A[i][i];
                }
            }
            return sum;
        }
        return -1;
    }
}
