package com.scaler.intermediate.dsa.contest1;

import java.lang.*;
import java.util.*;

public class MatrixGameII {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt(), Q = sc.nextInt();
        // System.out.println("N -" + N);
        // System.out.println("M -" + M);
        // System.out.println("Q -" + Q);
        int C1=0, C2=0, R1=0, R2=0, X1=0, Y1=0, X2=0, Y2=0;
        //create N*M array
        int ele = 1;
        if(N>= 1 && M>=1 && N <= 100000 && M<= 100000 && Q>=1 && Q<=100000){
            int[][] arr = new int[N][M]; //create array
            //fill the array
            for(int row=0; row<N; row++){
                for(int col=0; col<M; col++){ //N*M
                    arr[row][col] = ele++;
                }
            }

            //read Q query
            for(int queries=1; queries<=Q; queries++){ //Q
                int q = sc.nextInt();
                if(q == 1){
                    C1 = sc.nextInt();
                    C2 = sc.nextInt();
                    //column swap
                    if(C1 >= 1 && C1 <= M && C2 >= 1 && C2 <= M){
                        for(int row=0; row<N; row++){ //N
                            int temp = arr[row][C1-1];
                            arr[row][C1-1] = arr[row][C2-1];
                            arr[row][C2-1] = temp;
                        }
                    }

                } else if (q == 2){
                    R1 = sc.nextInt();
                    R2 = sc.nextInt();
                    //row swap
                    if(R1 >= 1 && R1 <= N && R2 >= 1 && R2 <= N){
                        for(int col=0; col<M; col++){ //M
                            int temp = arr[R1-1][col];
                            arr[R1-1][col] = arr[R2-1][col];
                            arr[R2-1][col] = temp;
                        }
                    }
                } else if(q == 3){
                    X1 = sc.nextInt();
                    Y1 = sc.nextInt();
                    X2 = sc.nextInt();
                    Y2 = sc.nextInt();
                    //print bitwise OR
                    if(X1>=1 && X1<=N && X2>=1 && X2 <= N && Y1 >= 1 && Y1 <= M && Y2 >= 1 && Y2 <= M){
                        System.out.println((arr[X1-1][Y1-1] | arr[X2-1][Y2-1]));
                    }
                } else if(q == 4){
                    X1 = sc.nextInt();
                    Y1 = sc.nextInt();
                    X2 = sc.nextInt();
                    Y2 = sc.nextInt();
                    //print bitwise AND
                    if(X1>=1 && X1<=N && X2>=1 && X2 <= N && Y1 >= 1 && Y1 <= M && Y2 >= 1 && Y2 <= M){
                        System.out.println((arr[X1-1][Y1-1] & arr[X2-1][Y2-1]));
                    }
                }
            }
        }
    }
}
