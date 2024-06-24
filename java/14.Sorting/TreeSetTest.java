import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> integerSet = new TreeSet<>();
       // ArrayList<Integer> integerSet = new ArrayList<>();
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        
        // This will work
        System.out.println("TreeSet with Integers:");
        for (Integer num : integerSet) {
            System.out.println(num);
        }
        
        // This will cause a compilation error
       // TreeSet<Object> mixedSet = new TreeSet<>();
        ArrayList<Object> mixedSet = new ArrayList<>();

        mixedSet.add("Hello");
        mixedSet.add(42); // Adding an integer
        
        for (Object obj : mixedSet) {
            System.out.println(obj);
        }
    }
}
