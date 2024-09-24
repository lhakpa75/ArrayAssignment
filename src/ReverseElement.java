//20) Program to print the elements of an array in reverse order
import java.util.Arrays;

public class ReverseElement {
    public static void reverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Reversed array: ");
        reverse(array);
    }
}
