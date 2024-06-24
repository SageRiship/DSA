public class FirstOccurance {

    public static int firstOccurance(int [] arr , int key,int i){
        if (i == arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }

    public static int lastOccurance(int [] arr , int key ,int i){
       // int i = arr.length-1;
        if (i == -1){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return lastOccurance(arr, key, i-1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,6,4,3};
        System.out.println(firstOccurance(arr, 3, 0));
        System.out.println(lastOccurance(arr, 1,arr.length-1));
    }
}
