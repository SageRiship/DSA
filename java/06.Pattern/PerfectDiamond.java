import java.util.Scanner;

public class PerfectDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        n=n-1;
        for (int l = n; l >= 1; l--) {
            for (int s = 0; s <= (n - l); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * l) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
