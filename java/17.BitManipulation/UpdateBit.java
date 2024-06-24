public class UpdateBit {

    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearBit(n, i);
        // } else {
        //     return setBit(n, i);
        // }

        n = clearBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask; 
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
