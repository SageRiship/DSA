public class PairInArray05 {

    public static void pairInArr(int []numbers){
        int tp =0;
        for (int i=0;i<numbers.length;i++){
            int start =i;
            for (int j=i;j<numbers.length ;j++){
                int end=j;
               for (int k=start;k<=end;k++){
                System.out.print(numbers[k]+" ");
               }
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs :"+tp);
    }

    public static void main(String[] args) {
        int numbers [] = {2,3,4,5,6};
        pairInArr(numbers);
    }
}
/*
 * formula = n(n+1)/2
 */