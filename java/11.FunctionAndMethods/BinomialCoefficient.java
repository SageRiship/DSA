public class BinomialCoefficient {
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    /*
     * nCr = (n!)/(r!)(n-r)!
     */

   

    public static int binomialCoefficient(int n, int r) {
        int factOfN = BinomialCoefficient.factorial(n);
        int factOfR = BinomialCoefficient.factorial(r);
        int factOfNR = BinomialCoefficient.factorial(n - r);
        int binomialCoe = factOfN / (factOfR * factOfNR);
        return binomialCoe;
    }

    public static void main(String[] args) {
        System.out.println(BinomialCoefficient.binomialCoefficient(5, 2));
    }
}
