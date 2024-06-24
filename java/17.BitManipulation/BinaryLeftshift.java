/*
 *  5 << 2 
 *  5 =0 0 1 0 1 
 *  now shift 5 to 2 places left
 *  5 << 2 = 1 0 1 0 0 
 *         = 20
 *  we also have formula for this 
 *  a << b = a * 2^b
 *  5 << 2 = 5 * 2^2
 *         = 20 
 */
public class BinaryLeftshift {
    public static void main(String[] args) {
        System.out.println(5 << 2);
    }
}
