package com.scaler.intermediate.dsa.hashing;

import java.util.*;
//TC - N+M - O(N+M)
//SC - n+4m - O(N+M)
public class FrequencyOfQuery {
    public int[] solve(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        if(n >= 1 && n<=100000 && m>=1 && m<=100000){
            HashMap<Integer, Integer> hm = new HashMap<>();//sc - n
            for(int i=0; i<n; i++){//n
                if(A[i]>=1 && A[i]<=100000){
                    if(hm.containsKey(A[i])){
                        int count = hm.get(A[i]);
                        hm.put(A[i], ++count);
                    } else {
                        hm.put(A[i], 1);
                    }
                } else {
                    return new int[0];
                }
            }
            // System.out.println("hm");
            // for(Integer k: hm.keySet()){
            //     System.out.println("key -" + k);
            //     System.out.println("val -" + hm.get(k));
            // }
            int[] arr = new int[m];//sc - 4m
            for(int i=0; i<m; i++){//m
                if(B[i]>=1 && B[i]<=100000){
                    if(hm.containsKey(B[i])){
                        arr[i] = hm.get(B[i]);
                    } else {
                        arr[i] = 0;
                    }
                } else {
                    return new int[0];
                }
            }
            return arr;
        }
        return new int[0];
    }
}
