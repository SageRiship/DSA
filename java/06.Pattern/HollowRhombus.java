import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j =n;j>i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                if(i==1 || i ==n|| j==1|| j==n){
                 System.out.print("*");
                }else{
                 System.out.print(" ");
                }
             }
            System.out.println();
        }
        sc.close();
    }
}
