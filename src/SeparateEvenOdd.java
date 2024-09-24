//13) Write a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers.
import java.util.Arrays;

public class SeparateEvenOdd {
    public static void separateEvenOdd(int[] array) {
        int[] result = new int[array.length];
        int evenIndex = 0, oddIndex = array.length - 1;

        for (int num : array) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }
        System.out.println("Array after separation: " + Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        separateEvenOdd(array);
    }
}
