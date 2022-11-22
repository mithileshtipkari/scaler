
public class CountOf1Bits {
    public int numSetBits(int A) {
        if(A>=1 && A<=1000000000){
            int count = 0;
            while(A > 0){
                if((A & 1) == 1){
                    count++;
                }
                A = A>>1;
            }
            return count;
        }
        return -1;
    }
}