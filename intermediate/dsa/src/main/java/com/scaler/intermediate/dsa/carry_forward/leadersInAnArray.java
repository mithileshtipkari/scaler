package com.scaler.intermediate.dsa.carry_forward;

public class leadersInAnArray {
    //TODO make this run afterwards, just putting the program now
    public int[] solve(int[] A) {
        int n = A.length;
        List<Integer> leaderList = new ArrayList<>();
        if(n >= 1 && n <= Math.pow(10,5)){
            if(A[n-1] >= 1 && A[n-1]<=Math.pow(10,8)){
                int max = A[n-1];
                leaderList.add(A[n-1]);
                for(int i = n-2; i >= 0; i--){
                    if(A[i] >= 1 && A[i] <= Math.pow(10,8)){
                        if(A[i] > max){
                            max = A[i];
                            leaderList.add(A[i]);
                        }
                    }
                }
            } else {
                return new int[0];
            }
        }
        int[] arr = new int[leaderList.size()];
        for(int i=0; i<leaderList.size(); i++){
            arr[i] = leaderList.get(i);
        }
        return arr;
    }
}
