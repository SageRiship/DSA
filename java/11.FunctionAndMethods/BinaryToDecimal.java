public class BinaryToDecimal {

    public static void biToDecimal(int n){
        int binNumber =n;
        int pow =0;
        int decNum=0;
        while (n>0){
            int lastDigit = n%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of :"+binNumber+" is :"+decNum);
    }

    public static void main(String[] args) {
        BinaryToDecimal.biToDecimal(1001);
    }
}
