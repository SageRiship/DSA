import java.util.HashSet;

public class DuplicateElements {

    public static void main(String[] args) {
        Integer[] nums = { 1,2,3,4,5,6,6 };

        HashSet<Integer> hTargetSet = new HashSet<>();
        for(Integer n : nums){
            System.out.println(hTargetSet.add(n));
        }
    }
}
