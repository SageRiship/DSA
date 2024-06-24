public class StringDecompression {
    public static String compress(String str){
        String newStr = "";
        
        for(int i=0;i<str.length();i++){
            Integer count=1;
            
            while(i <str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count >1){
                newStr += count.toString();
            }
            count=0;
        }
        return newStr;
    }
    public static void main(String[] args) {
        
        String str= "aaaabbbccddddde";
        //a4b3c2d4e
        System.out.println(compress(str));
    }
}
