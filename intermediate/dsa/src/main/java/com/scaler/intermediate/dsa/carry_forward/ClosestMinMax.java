package com.scaler.intermediate.dsa.carry_forward;

public class ClosestMinMax {

    public int solve(int[] A) {
        int n = A.length;
        int m_len = n;
        if(n >= 1 && n <= 2000){

            //find max n min
            int[] arrMaxMin = getMaxMin(A);
            int max = arrMaxMin[0];
            int min = arrMaxMin[1];

            //calculate subarray-
            if(max == min) return 1; // smallest possible subarray having one ele
            int max_i = -1;
            int min_i = -1;
            for(int i=0; i<n; i++){ //N times
                if(A[i] == max){
                    max_i = i;
                    if(min_i != -1){
                        int len = max_i - min_i + 1;
                        if(len < m_len){
                            m_len = len;
                        }
                    }
                } else if(A[i] == min){
                    min_i = i;
                    if(max_i != -1){
                        int len = min_i - max_i + 1;
                        if(len < m_len){
                            m_len = len;
                        }
                    }

                }
            }
        } else {
            return 0;
        }
        return m_len;
    }

    private int[] getMaxMin(int[] A){
        int max = A[0];
        int min = A[0];
        for(int i=1; i<A.length; i++){ //N times
            if(A[i] >= max){
                max = A[i];
            } else if(A[i] <= min) {
                min = A[i];
            }
        }
        return new int[] {max, min};
    }
    //TC - N(calculate max & min) + N(calculate subarray) = O(N)
    //SC - O(1), 1 array of 2 ele created to find max min
}
