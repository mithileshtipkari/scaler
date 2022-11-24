public class PowerWithModulas{
    public int solve(int A, int B, int C) {
        if(A>=1 && A<=1000000000 && B>=0 && B<=100000 && C>=1 && C<=1000000000){
            long ans = 1;
            for(int i=1; i<=B; i++){
                ans = (ans * A)%C;
            }
            return (int)ans;
        }
        return -1;
    }
}