import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ColletionTest {
    public static void main(String[] args) {
     /* 
        Vector<Integer> integerVector = new Vector<>(); // Vector is just one example of a collection
        
        integerVector.add(10);
        integerVector.add(20);
        integerVector.add(30);
        
        // Get an Enumeration for the vector
        Enumeration<Integer> enumeration = integerVector.elements();
        
        // Traverse the elements using the Enumeration
        while (enumeration.hasMoreElements()) {
            Integer value = enumeration.nextElement();
            System.out.println(value);
            integerVector.remove(0);
        }
*/
        ArrayList<Integer> integerList = new ArrayList<>();
        
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        
        // Get an Iterator for the ArrayList
        Iterator<Integer> iterator = integerList.iterator();
        
        // Traverse the elements using the Iterator
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
            integerList.remove(0);
        }
    }
}
