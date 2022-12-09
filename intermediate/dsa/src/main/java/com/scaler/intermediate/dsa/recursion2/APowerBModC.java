package com.scaler.intermediate.dsa.recursion2;

public class APowerBModC {
    public long pow(int A, int B, int C) {
        if(A>= -1000000000 && A<=1000000000 && B>=0 && B<=1000000000 && C>=1 && C<=1000000000){
            if(B == 1){//base case
                // System.out.println("A % C -" + (A%C)+C);
                if(A<0){//for negative A, -A%C gives wrong ans in java so do -A%C + C
                    return A%C+C;
                }
                return A % C;
            }
            if(B == 0){// anything raised to 0 is 1 -> A^0 = 1
                if(A<0){//for -ve no in java, (-ve no) % C => (-ve no) % C + C
                    return 1%C+C;
                }
                return 1 % C;
            }
            long ans = pow(A, B/2, C);
            if(B%2 == 0){
                return (ans * ans) % C;
            } else {
                return ((ans * ans)%C * A) % C;
            }
        }
        return -1;
    }
}
