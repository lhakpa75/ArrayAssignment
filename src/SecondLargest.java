//11) Write a Java program to find the second largest element in an array.
import java.util.Arrays;

public class SecondLargest {
    public static int findSecondLargest(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Second largest element: " + findSecondLargest(array));
    }
}
