package com.scaler.intermediate.dsa.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatingEle {
    public static void main(String[] args) {
        int[] A = new int[]{10,5,3,4,3,5,6};
        System.out.println("ans - "+ solve(A));
    }
    public static int solve(int[] A) {
        int n = A.length;
        if(n>=1 && n<=100000){
            Map<Integer, Integer> hm = new LinkedHashMap<>();//take LinkedHashMap to maintain insertion order
            hm.put(A[0], 1);//add first ele as it is with count 1
            //iterate on array and put ele and their count in HashMap
            for(int i=1; i<n; i++){//N
                // System.out.println("ele -" + A[i]);
                if(hm.containsKey(A[i])){
                    //if key is already present, then update value of key by 1
                    //hm.put(ele, oldcount + 1);
                    hm.put(A[i], (hm.get(A[i])+1));
                }else {
                    hm.put(A[i], 1);
                }
                // System.out.println("ele -- val-" + A[i] + "--" + hm.get(A[i]));
            }
            //now iterate on HashMap to get first key with value > 1, which would be first repeating ele
            for(Integer key: hm.keySet()){//N
                if(hm.get(key) > 1) return key;
            }
        }
        return -1;
    }
    //TC - N + N -> O(N)
    //SC - N for hashmap
}
