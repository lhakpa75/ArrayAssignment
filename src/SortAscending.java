//24) Program to sort the elements of an array in ascending order
import java.util.Arrays;

public class SortAscending {
    public static void sortAscending(int[] array) {
        Arrays.sort(array);
        System.out.println("Array in ascending order: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 1};
        sortAscending(array);
    }
}
