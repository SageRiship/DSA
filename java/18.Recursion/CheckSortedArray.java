public class CheckSortedArray {

    public static boolean checkSorted(int []arr , int i){
        if(i == arr.length-1 ){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return checkSorted(arr, i+1);
    }
    public static void main(String[] args) {
        System.out.println(checkSorted(new int[]{1,2,3,6,4,5},0));
    }
}
