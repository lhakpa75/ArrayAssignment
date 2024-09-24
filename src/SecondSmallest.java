//12) Write a Java program to find the second smallest element in an array.
import java.util.Arrays;

public class SecondSmallest {
    public static int findSecondSmallest(int[] array) {
        Arrays.sort(array);
        return array[1];
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 3};
        System.out.println("Second smallest element: " + findSecondSmallest(array));
    }
}
