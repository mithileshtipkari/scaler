package com.scaler.intermediate.dsa.sliding_window;
//TC - N + K + (N-K) = O(2N) = O(N)
//SC - O(1), const no of variables used
public class MinimumSwaps {
    public int solve(int[] A, int B) {
        //find no. of ele < B, that would be size of subarray
        int k=0;
        int n = A.length;
        if(n >= 1 && n <= 100000){
            for(int i=0; i<n; i++){//N times
                if(A[i] >= -1000000000 && A[i] <= 1000000000 && B >= -1000000000 && B <= 1000000000){
                    if(A[i] <= B) k++;
                }
            }
        }
        //edge cases for k
        //if k == 0, ele <= B are zero then no swaps required, so return 0
        //if k == 1, ele <= B is only one, then still no swap required as it is only one ele
        //if k == n, all ele in array are <= B, so no swap required as all them are already together
        if(k == 0 || k ==1 || k == n) return 0;
        //now iterate on first subarray
        int s = 0, e = k-1;
        int swapCount = 0;
        for(int i=s; i<=e; i++){// or for first subarray use i=0 i<k // TC- k times
            if(A[i] > B) swapCount++;
        }
        // System.out.println("swapCount ="+ swapCount);
        //now start swap count calculation from second subarray
        int minSwapCount = swapCount;
        s++; e++; //move to next subarray, or s=1, e=k
        while(e<n){// N-k times
            if(A[s-1] > B) swapCount--;
            if(A[e] > B) swapCount++;
            if(swapCount < minSwapCount) minSwapCount = swapCount;
            s++;
            e++;
        }
        // System.out.println("swapCount ="+ minSwapCount);
        return minSwapCount;
    }
    //TC - N + K + (N-K) = O(2N) = O(N)
    //SC - O(1), const no of variables used
}
