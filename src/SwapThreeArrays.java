//27) Swap three array with temp variable
import java.util.Arrays;

public class SwapThreeArrays {
    public static void swapThreeArrays(int[] array1, int[] array2, int[] array3) {
        int[] temp = Arrays.copyOf(array1, array1.length);
        System.arraycopy(array2, 0, array1, 0, array2.length);
        System.arraycopy(array3, 0, array2, 0, array3.length);
        System.arraycopy(temp, 0, array3, 0, temp.length);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};

        System.out.println("Before swap: ");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Array3: " + Arrays.toString(array3));

        swapThreeArrays(array1, array2, array3);

        System.out.println("After swap: ");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Array3: " + Arrays.toString(array3));
    }
}
