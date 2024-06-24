import java.util.Scanner;

public class InvertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roes of star :");
        int n = sc.nextInt();

        for (int i = 1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
