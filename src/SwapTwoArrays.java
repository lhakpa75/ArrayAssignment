//16) Swap two array with temporary variable.
import java.util.Arrays;

public class SwapTwoArrays {
    public static void swapArrays(int[] array1, int[] array2) {
        int[] temp = Arrays.copyOf(array1, array1.length);
        System.arraycopy(array2, 0, array1, 0, array2.length);
        System.arraycopy(temp, 0, array2, 0, temp.length);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println("Before swap: ");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        swapArrays(array1, array2);

        System.out.println("After swap: ");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
    }
}
