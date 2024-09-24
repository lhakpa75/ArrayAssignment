//6) Write a Java program to reverse an array of integer values
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Original array: " + Arrays.toString(array));

        reverseArray(array);

        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}