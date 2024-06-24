/*
 *  5 = 1 0 1
 *  ~ 5 
 *  0 0 0 0 0 0 1 0 = 5
 * -1 0 0 0 0 0 1 0 = -5 
 *  LSB = least significant bit , right most
 *  MSB = most significant bit , left most
 * here MSB is 0 i.e. +ve means number is positive
 * to calculate:
 * 1s compliment 
 *   0 0 0 0 0 1 0 1
 *    +            1
 * -------------------------- 
 *              1  1  0   (here 1+1 = 2 means 1 0 in binary )
 * here 6 but now 6 will be mins 
 * = -6
 */

public class Binary1sCompliment {
    public static void main(String[] args) {
        System.out.println(~0);
    }
}
