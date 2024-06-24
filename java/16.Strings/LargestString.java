public class LargestString {
    //Lexicographically largest

    public static void LargeString(String[] str){
        String largest = str[0];
        for(int i=0;i<str.length;i++){
            if(largest.compareTo(str[i]) < 0 ){
                largest = str[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String [] str = {"apple", "orange", "banana","mango"};
        LargeString(str);
        
    }
}
