import java.util.Arrays;

public class SegragateOsand1s {

    public static void segregate0sAnd1sOptimized(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        
        while (s < e) {
            // Increment s index until a 1 is found
            while (arr[s] == 0 && s < e) {    //if s=0 we dont need to do anything so ++
                s++;
            }
            // Decrement e index until a 0 is found
            while (arr[e] == 1 && s < e) {
                e--;
            }
            // Swap arr[s] and arr[e]
            if (s < e) {
                arr[s] = 0;
                arr[e] = 1;
                s++;
                e--;
            }
        }
    }

    public static void segragateOsand1(int []arr){
        int count0 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<arr.length;i++){
            arr[i] = 1;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,0,0,0,1,1,1,1,0,0,1,1,0,0};
        //segragateOsand1(arr);
        segregate0sAnd1sOptimized(arr);
        System.out.println(Arrays.toString(arr));
    }
}
