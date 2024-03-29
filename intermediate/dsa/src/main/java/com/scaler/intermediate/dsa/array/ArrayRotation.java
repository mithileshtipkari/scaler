public class ArrayRotation {
//TC - O(n)
//SC - O(n)
    public int[] solve(int[] A, int B) {
        int n = A.length;
        if(n>=1 && n<=100000 && B>=1 && B<=1000000000){
            
            if(B>=n){
                if(B%n == 0){ return A; }
                B = B%n;
            }
            int[] arr = new int[n];
            //iterate from B to n-1, and add ele into arr
            int j=0;
            for(int i=n-B; i<n; i++){
                if(A[i]>=1 && A[i]<=1000000000){
                    arr[j++] = A[i];
                } else {
                    return new int[0];
                }
            }
            // for(int k: arr){
            //     System.out.println("f k -"+k);
            // }
            //iterate from 0 to B-1, and add ele into arr
            for(int i=0; i<n-B; i++){
                if(A[i]>=1 && A[i]<=1000000000){
                    arr[j++] = A[i];
                } else {
                    return new int[0];
                }
            }
            // for(int k: arr){
            //     System.out.println("s k -"+k);
            // }
            return arr;
        }
        return new int[0];
    }
}
