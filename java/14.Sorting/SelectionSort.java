import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min]){        //for descending sort change sign to ">"
                    min=j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] numbers = {2,7,5,8,1,6,4};
        System.out.println(Arrays.toString(selectionSort(numbers)));
    }
}
