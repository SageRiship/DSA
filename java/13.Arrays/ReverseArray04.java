import java.util.Arrays;

public class ReverseArray04 {

    public static int[] reverseArr(int [] numbers){
        int low =0;
        int high = numbers.length-1;
        while(low<high){
            int temp = numbers[low];
            numbers[low] =numbers[high];
            numbers[high]=temp;
            low++;
            high--;

        }
        return numbers;
    }
    public static void main(String[] args) {
        int numbers [] = {2,3,4,5,6,7,8,9};
        

        int [] rArray = ReverseArray04.reverseArr(numbers);
        System.out.println(Arrays.toString(rArray));
    }
}
