package com.scaler.intermediate.dsa.sliding_window;
//TC = (N-B) + B = O(N)
//SC = O(1)
public class subarray_with_given_sum_and_length {
    public int solve(int[] A, int B, int C) {
        int n = A.length;
        // int ans = 0;
        if(n>=1 && n<=100000 && B >= 1 && B <= n && C >= 1 && C <= 1000000000){
            int s=0, e=B-1;
            while(e < n){ // N-B times
                int sum = 0;
                for(int i=s; i<=e; i++){ //iterate over subarray - B time - size of subarras
                    if(A[i]>=1 && A[i]<=10000){
                        sum = sum + A[i];
                    } else {
                        return 0;
                    }
                }
                // System.out.println("sum for s = " + s + " e = " + e + " -> " + sum);
                if(sum == C) return 1;
                s++;
                e++;
            }
        } else {
            return 0;
        }
        return 0;
    }
}
