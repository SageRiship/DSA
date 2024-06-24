public class SubString {
    public static void printSubString(String str ,int si,int ei){
        String s = "";
        for(int i=si;i<ei;i++){
            s = s + str.charAt(i);
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "HelloWorld" ;
       // printSubString(str, 0, 4);
        System.out.println(str.substring(0, 4));
    }
}
