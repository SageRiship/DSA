public class BinarySearch03 {
    /*
     * Algorithm
     * 
     * 
     * int low, high ,key
     * mid = high+low/2
     * while(low<=high){
     * if(key == a[mid]){
     * return mid;
     * }else if(key < a[mid] ){
     * h=mid-1
     * l=l
     * }else{
     * l=mid+1
     * h=h
     * }
     * }
     */

     public static int binarySearch(int[] numbers,int key){
        int high=numbers.length-1;
        int low=0;
        int mid=0;
        while(low<=high){
            mid=high+low/2;
            if(key==numbers[mid]){
                return mid;
            }else if(key<numbers[mid]){
                high=mid-1;
                low=low;
            }else{
                low=mid+1;
                high=high;
            }
        }
        return -1;
     }

     public static void main(String[] args) {
        int[] numbers = { 10, 20, 24,26,28,36,47,58,66,78,79,89,90};
        int index = BinarySearch03.binarySearch(numbers, 36);
        System.out.println("Key found at Index :"+index);
     }
}
