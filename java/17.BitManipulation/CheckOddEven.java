public class CheckOddEven {

    public static void oddEven(int n){
        int bitMask = 1 ;
        if((n&bitMask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddEven(10);
        oddEven(12);
        oddEven(13);
        oddEven(17);
        /*
         *  5 & 1 = 1 0 1 
         *              1
         * -----------------
         *              1 (odd) 
         * 
         * **********************
         * 10 & 1 = 1 0 1 0  
         *                1
         * -----------------
         *                0 (even) 
         */
    }
}
