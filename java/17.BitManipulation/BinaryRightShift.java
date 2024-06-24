/*
 *  6 >> 1 
 *  6 =0 0 1 1 0 
 *  now shift 6 to 1 places right
 *  6 >> 1 = 0 0 0 1 1 
 *         = 3
 *  we also have formula for this 
 *  a >> b = a / 2^b
 *  6 >> 1 = 6 / 2^1
 *         = 3 
 */
public class BinaryRightShift {
    public static void main(String[] args) {
        System.out.println(6 >> 1);
    }
}
