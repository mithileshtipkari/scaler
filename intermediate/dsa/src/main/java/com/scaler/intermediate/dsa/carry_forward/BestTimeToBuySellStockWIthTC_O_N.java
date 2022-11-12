package com.scaler.intermediate.dsa.carry_forward;
//TC - O(N)
public class BestTimeToBuySellStockWIthTC_O_N {
    public int maxProfit(final int[] A) {
        int n = A.length;
        int maxProfit = 0;
        if(n > 0 && n<= 700000){
            if(A[n-1] >= 1 && A[n-1] <= 10000000){
                int max = A[n-1];
                for(int i=n-2; i>=0; i--){ // runs n-2 times TC = O(N-2) = O(N)
                    if(A[i] >= 1 && A[i] <= 10000000){
                        int profit = 0;
                        if(A[i] > max){
                            max = A[i];
                            profit = 0;
                        } else {
                            profit = max - A[i];
                        }
                        if(profit > maxProfit) maxProfit = profit;
                    }
                }
            } else {
                return 0;
            }
        }
        return maxProfit;
    }
}
