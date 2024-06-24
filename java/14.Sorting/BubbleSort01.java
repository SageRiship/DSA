import java.util.Arrays;

public class BubbleSort01{

    public static int[] bubbleSort(int [] numbers){
        for(int i=0;i<numbers.length -1;i++){
            for (int j=0;j<numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        return numbers;
    }
    public static void main(String[] args) {
        int [] numbers = {2,7,5,8,1,6,4};
        System.out.println(Arrays.toString(bubbleSort(numbers)));
    }
}