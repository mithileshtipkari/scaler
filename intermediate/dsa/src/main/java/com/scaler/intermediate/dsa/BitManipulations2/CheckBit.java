public class CheckBit {
    public int solve(int A, int B) {
        if(A>=1 && A<=1000000000 && B>=0 && B<=30){
            if((A & (1<<B)) == (1<<B)){
                return 1;
            } else {
                return 0;
            }
        }
        return -1;
    }
}