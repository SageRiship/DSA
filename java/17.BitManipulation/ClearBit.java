public class ClearBit {

    public static int clearIthBit(int number , int i){
        int bitMask = ~(1<<i);
        return number&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 3));
    }
}
