package com.scaler.intermediate.dsa.hashing;

import java.util.HashSet;

public class SubArrayWith0Sum {
    //TC - N, one loop, SC - N, HashSet
    public int solve(int[] A) {
        int n = A.length;
        HashSet<Long> hs = new HashSet<>();
        if(n>=1 && n<=100000){

            long[] pf = new long[n];
            if(A[0]>=-1000000000 && A[0]<=1000000000){
                //handle single ele, if A has single ele that is 0, subarray of len 1 is possible
                //which would have sum as 0, so return 1
                if(n==1 && A[0] == 0) return 1;
                pf[0] = A[0];
                hs.add(pf[0]);
            } else {
                return -1;
            }

            for(int i=1; i<n; i++){//TC - N
                if(A[i]>=-1000000000 && A[i]<=1000000000){
                    pf[i] = pf[i-1] + A[i];
                    if(pf[i] == 0){
                        return 1;
                    }
                    hs.add(pf[i]);
                }
            }
            return pf.length != hs.size() ? 1 : 0;
        }
        return -1;
    }
}
