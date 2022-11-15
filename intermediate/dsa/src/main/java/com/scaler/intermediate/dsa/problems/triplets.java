package com.scaler.intermediate.dsa.problems;
//TC = O(N)
//TC - outer loop - N-2
//        for every j, inner loop runs N-1 times
//          N-2(N-1) = N^2 - 2N - N -1 = O(N^2)
//        so overall TC - O(N^2) ??
public class triplets {
    public int solve(int[] A) {
        int N = A.length;
        int totalTriplets = 0;
        if(N >= 1 && N <= 1000){//constraints
            if(A[0] >= 1 && A[0] <= 1000000000 && A[N-1] >= 1 && A[N-1] <= 1000000000){// constraints for 1st & last ele
                for(int j=1; j<=N-2; j++){
                    if(A[j] >= 1 && A[j] <= 1000000000){//constraints
                        //calculate no. of ele < A[j]
                        int l = 0;
                        for(int i = j-1; i>=0; i--){
                            if(A[i] < A[j]) l++;
                        }
                        //calculate no. of ele > A[j]
                        int r = 0;
                        for(int k=j+1; k<=N-1; k++){
                            if(A[k] > A[j]) r++;
                        }
                        //no of current triplets for j + total count of triplets
                        totalTriplets = totalTriplets + (l * r);
                    }
                }
            }
        }
        return totalTriplets;
    }
}
