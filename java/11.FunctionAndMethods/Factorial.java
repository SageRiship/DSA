public class Factorial{

    public static int factorial(int n){
        int factorial = 1;
        for(int i =1;i<=n;i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        
        System.out.println(Factorial.factorial(4));
    }
}