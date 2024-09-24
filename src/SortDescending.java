//25) Program to sort the elements of an array in descending order
import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void sortDescending(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array in descending order: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        Integer[] array = {5, 3, 8, 2, 1};
        sortDescending(array);
    }
}
