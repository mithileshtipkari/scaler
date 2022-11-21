package com.scaler.intermediate.dsa.contest1;

public class BinaryNo {
    public int solve(int A, int B) {
        int sum = 0;
        if(A+B >= 1 && A+B <= 30){
            for(int i = (A+B-1); i>=B; i--){
                sum = sum + (int)Math.pow(2,i); //use left shift for pow
            }
        }
        return sum;
    }
}
