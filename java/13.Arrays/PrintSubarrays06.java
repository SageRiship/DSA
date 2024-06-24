public class PrintSubarrays06 {
    public static void pairInArr(int []numbers){
        int tp =0;
        for (int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for (int j=i+1;j<numbers.length ;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs :"+tp);
    }

    public static void main(String[] args) {
        int numbers [] = {2,3,4,5,6,7,9};
        pairInArr(numbers);
    }
}
/*
 * formula = n(n-1)/2
 */