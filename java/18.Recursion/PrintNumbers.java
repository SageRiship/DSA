public class PrintNumbers{

    public static void printDesc(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        System.out.print(n+" ");
        printDesc(n-1);
    }
    public static void printAsc(int n){
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printAsc(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        printDesc(10);
        System.out.println();
        printAsc(10);
    }
}