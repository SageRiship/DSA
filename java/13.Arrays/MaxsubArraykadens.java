public class MaxsubArraykadens {
    /*
    kadens Algorithm
    it says that when adding or subtracting two numbers give negative result 
    instead of negative result take it as "0"
     */

    public static int kadens(int []numbers){
        int curr = 0 ;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<numbers.length ;i++){
            curr = curr+numbers[i];
            if (curr < 0){
                curr = 0;
            }
            max = Math.max(curr, max);
        }
        return max;
    } 

     public static void main(String[] args) {
        //int [] num= {-2,-3,4,-1,-2,1,5,-3};
        int[] num = { 1, 2, 3, 4, 5, 6 };
        int maxVal = MaxsubArraykadens.kadens(num);
        System.out.println(maxVal);
        System.out.println(-1 > -2);
     }
}
