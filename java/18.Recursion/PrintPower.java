public class PrintPower {

    public static int printPower(int x, int n){
        if (n==1){
            return x;
        }
        return x*printPower(x, n-1);
    }

    public static int printPowerOptimised(int x, int n){
        if (n==1){
            return x;
        }
        int halfPower = printPowerOptimised(x, n/2);
        int halfPowerSq = halfPower *halfPower;
        if(n %2!=0){
            halfPowerSq = x *halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
       //we want x^n 
       System.out.println(printPower(2, 4));
    }
}
