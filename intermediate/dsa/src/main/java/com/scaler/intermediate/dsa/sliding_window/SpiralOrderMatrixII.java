package com.scaler.intermediate.dsa.sliding_window;

public class SpiralOrderMatrixII {
    public int[][] generateMatrix(int A) {
        int[][] arr = new int[A][A];
        if(A>=1 && A<=1000){
            int value = 1;
            int row=0, col=0, n=A;
            while(n>1){
                value = printSpiralEleAndReturnValue(arr, row, col, n, value);
                // printArr(arr);
                row++; col++;
                n = n-2;
            }
            if(n==1){
                arr[row][col] = value;
            }

        }
        return arr;
    }

    public int printSpiralEleAndReturnValue(int[][] arr, int row, int col, int n, int value){
        //print first row
        for(int k=1; k <= n-1; k++){
            arr[row][col] = value;
            value++;
            col++;
        }
        //print last column
        //col same, row increments, top to bottom
        for(int k=1; k <= n-1; k++){
            arr[row][col] = value;
            value++;
            row++;
        }
        //print last row, col changes from right to left
        for(int k=1; k <= n-1; k++){
            arr[row][col] = value;
            value++;
            col--;
        }
        //print first row, bottom to top, row will change
        for(int k=1; k <= n-1; k++){
            arr[row][col] = value;
            value++;
            row--;
        }
        return value;
    }

    public void printArr(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
