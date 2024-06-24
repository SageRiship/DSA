import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean isDuplicate(int []numbers){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<numbers.length;i++){
            if(set.contains(numbers[i])){
                return true;
            }else{
                set.add(numbers[i]);
            }
        }

       
        return false;
    }
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        System.out.println(isDuplicate(numbers));

    }
}
