public class PrimeInRange {
    public static boolean checkPrime(int n) {
        boolean isPrime = true;
        // for (int i = 2;i*i<=n;i++){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static void PrimeInrange(int n){
        for (int i=2;i<n;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PrimeInRange.PrimeInrange(20);

        for (int i =2 ;i<5;i++){
            System.out.println(i);
        }
    }
}
