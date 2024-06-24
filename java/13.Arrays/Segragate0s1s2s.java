import java.util.Arrays;

public class Segragate0s1s2s {

    public static void segragate0s1s2sImpl(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;
        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0 };
        segragate0s1s2sImpl(arr);
        System.out.println(Arrays.toString(arr));

    }

}
