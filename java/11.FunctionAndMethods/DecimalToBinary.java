public class DecimalToBinary {
    public static int  decimalToBi(int n){
        int binaryVal=0;
        
        int pow=0;
        while(n>0){
            int remainder= n%2;
            binaryVal =binaryVal +(remainder *(int) Math.pow(10, pow));
            n=n/2;
            pow++;
        }
        return binaryVal;
    }
    public static void main(String[] args) {
        int bin = DecimalToBinary.decimalToBi(8);
        System.out.println("Binary : "+bin);
      
        // String a = "11001";
        // int b = Integer.parseInt(a);
        // System.out.println(b);
    }
}
