public class IsPowerOfTwo {

    public static boolean isNumberPower(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isNumberPower(15));
    }

}
