//26) Swap two array with temp variable
import java.util.Arrays;

public class SwapTwoArraysWithTemp {
    public static void swapArrays(int[] array1, int[] array2) {
        // Create a temporary array to store one of the arrays
        int[] temp = new int[array1.length];

        // Copy the contents of array1 to temp
        System.arraycopy(array1, 0, temp, 0, array1.length);

        // Copy the contents of array2 to array1
        System.arraycopy(array2, 0, array1, 0, array2.length);

        // Copy the contents of temp (which holds array1) to array2
        System.arraycopy(temp, 0, array2, 0, temp.length);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println("Before swap:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        // Swap the arrays
        swapArrays(array1, array2);

        System.out.println("After swap:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
    }
}
