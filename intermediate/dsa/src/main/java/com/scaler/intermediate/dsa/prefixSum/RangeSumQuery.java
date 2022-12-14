package com.scaler.intermediate.dsa.prefixSum;

//TC - O(N+M)
//SC - O(8N+8M) => O(N+M) - to create pf & ans array

public class RangeSumQuery{
	public long[] rangeSum(int[] A, int[][] B) {
        //steps
        //create ans arr, ans len will be same as B
        int m = B.length;
        int n = A.length;
        if(n>=1 && n<=100000 && m>=1 && m<=100000){ // problem constaints
            long[] ans = new long[m];
            //create PF
            long[] pf = new long[n];//crate pf as long, because see below
            if(A[0]>=1 && A[0]<=1000000000){//problem constaints
                pf[0] = A[0];
            } else {
                return new long[0];
            }

            for(int i=1; i<n; i++){//N
                if(A[i]>=1 && A[i]<=1000000000){ //problem constaints
                    pf[i] = pf[i-1] + A[i]; //while adding ele into pf if u use pf type as int, it can result in overflow
                    //10^9 + 10^9 -> cannot be stored in int, so take pf type as long, it can store number upto 10^18
                } else {
                    return new long[0];
                }
            }
            //printing
            // for(int k: pf){
            //     System.out.println("k -" + k);
            // }
            //iterate on B queries, fetch sum from PF array, put it in ans array
            for(int i=0; i<m; i++){//M
                int L = B[i][0];
                int R = B[i][1];
                // System.out.println("L =" + L);
                // System.out.println("R =" + R);
                if(L>=1 && L<=R && L<=n && R>=1 && R>=L && R<=n){
                    if(L == 1){
                        ans[i] = pf[R-1];
                    } else {
                        ans[i] = pf[R-1] - pf[L-2];
                    }
                } else {
                    return new long[0];
                }
            }
            //printing
            // for(long k: ans){
            //     System.out.println("k -" + k);
            // }
            return ans;
        }
        return new long[0];
    }

}
