
/*
 * binary value of 1 = 0000000001
 * 1st 0 is msb , 0 means positive
 * binary value of -1 = 1000000001
 * 1st 1 is msb , 1 means negative
 */

public class ClearLastIthBits {

    public static int clearLastBits(int n, int i) {
        int bitMask = (-1) << i; // here use -1 or (~0) both are same
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearLastBits(15, 2));
    }
}
