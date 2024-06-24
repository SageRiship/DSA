import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] nums) {
        // have to start from i=1 because we are considering first one is sorted
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > temp){
                nums[j+1] = nums[j];
                j--;        //for last iteration j=-1
            }
            nums[j+1] =temp;          //here j+1 make j=0
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] numbers = {  7, 5, 8, 1, 6, 4 };
        System.out.println(Arrays.toString(insertionSort(numbers)));
    }
}
