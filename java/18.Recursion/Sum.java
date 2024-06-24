public class Sum {

    public static int sumOfNum(int n){
        
        if (n==1){
            return 1;
        }

        return n + sumOfNum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNum(5));
    }
}
/*
 *  n + sumOfNum(n-1)
 *  3 + sumOfNum(2)
 *      2 + sumOfNum(1 )
 * 
 */