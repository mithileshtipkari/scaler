package com.scaler.intermediate.dsa.carry_forward;
//this one gives O(N^2) TC, which is bad, check another solution for O(N)
public class BestTimeToBuySellStock {
    public int maxProfit(final int[] A) {
        int n = A.length;
        int maxProfit = 0;
        if(n > 0 && n<= 700000){
            for(int i=0; i<n; i++){
                int max = 0;
                if(i == n-1){
                    max = 0;
                } else {
                    max = getMaxEle(A, i);
                }
                if(max == -1) return 0;
                int profitForI = max - A[i];
                if(profitForI > maxProfit){
                    maxProfit = profitForI;
                }
            }
        } else {
            return 0;
        }
        return maxProfit;
    }

    public int getMaxEle(int[] A, int minIndex){
        int max = A[minIndex+1];
        for(int i=minIndex+1; i<A.length; i++){
            if(A[i] >= 1 && A[i] <= 10000000){
                if(A[i] > max) max = A[i];
            } else {
                return -1;
            }
        }
        return max;
    }
}
