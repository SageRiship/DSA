public class GetBit {

    public static int getIthBit(int number, int i) {
        int bitMask = 1 << i;
        if ((number & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
    }
}
