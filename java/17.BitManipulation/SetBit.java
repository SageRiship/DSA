public class SetBit {

    public static int setBit(int number , int n){
        int bitMask = 1 << n ;
        return number | bitMask;
    }

    public static int intToBin(int num){
        if(num ==0){
            return 0;
        }
        int bin=0 ;
          int pow = 0;
        while(num > 0){
          
            int remainder = num % 2;
           bin = bin + remainder * (int)Math.pow(10, pow);
           num /=2;
           pow++;

        }
        return bin;
    }

    public static int binToInt(int bin){
        int num = 0;
        int pow = 0;
        while (bin>0){
            int remainder = bin%10;
            num = num + remainder * (int)Math.pow(2, pow);
            bin /= 10;
            pow++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(setBit(10, 2));
        System.out.println(intToBin(10));
        System.out.println(binToInt(101));
    }
}
