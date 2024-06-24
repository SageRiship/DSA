import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Integer[] array = {5, 2, 9, 1, 7};

        // Sorting array in descending order using lambda expression
        Arrays.sort(array, (a, b) -> b-a);

        // Printing the sorted array
        System.out.println(Arrays.toString(array));
    } 
}
