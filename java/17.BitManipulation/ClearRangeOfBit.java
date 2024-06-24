/*
 * binary value of 1 = 0000000001
 * 1st 0 is msb , 0 means positive
 * binary value of -1 = 1000000001
 * 1st 1 is msb , 1 means negative
 */
/*
 * consider range = 111111111111
 * we have clear range between 2 and 7 
 * 111111111111
 */
/*
 * 1 = 2^1 -1
 * 11 = 2^2 -1
 * 111 = 2^3 -1
 * 1111 = 2^4 -1
 * 11111 = 2^5 -1 
 */
public class ClearRangeOfBit {
    public static int clearRange(int n, int i, int j) {
        int jBitMask = (-1) << (j + 1);
        int iBitMask = (1 << i) - 1; // here (1 << i) = 2^i (do this by adding actual value in i) and - 1 
        int bitMask = iBitMask | jBitMask ;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearRange(10, 2, 4));
    }
}
