import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows of star :");
        int n = sc.nextInt();

        //first half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int l = 1; l <= (n - i) * 2; l++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int l = 1; l <= (n - i) * 2; l++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        sc.close();
    }
}
/*
 * 
 * Enter Rows of star :4
 * 
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *


 */