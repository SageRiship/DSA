/*
 * any  number require only (log n+1) bits to represent it in binary format
 * 
 */
public class CountSetBits {
  
    public static int countBit(int n){
        int count =0;
        while(n > 0){
            if( (n & 1) != 0){      //checking LSB here
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBit(10));
    }
}
