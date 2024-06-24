/*
 *
 Input:  x = 2, y = 3, p = 5
Output: 3
Explanation: 2^3 % 5 = 8 % 5 = 3.

Input:  x = 2, y = 5, p = 13
Output: 6
Explanation: 2^5 % 13 = 32 % 13 = 6.
 */
public class ModulerExponetial {
    public static int  modularExpo(int x, int y, int p) {
        int ans = 1;
        while (y > 0){
            if ((y&1)!= 0){
                ans = ans * x;
            }
            x=x*x;
           y= y>>1;
        }
        return ans%p;
    }

    public static void main(String[] args) {
        System.out.println(modularExpo(2,5, 13));
        
    }
}
