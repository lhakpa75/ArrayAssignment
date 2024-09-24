//14)Write a Java program to find the k largest elements in a given
//array. Elements in the array can be in any order
import java.util.Arrays;

public class KLargest {
    public static int[] findKLargest(int[] array, int k) {
        Arrays.sort(array);
        return Arrays.copyOfRange(array, array.length - k, array.length);
    }

    public static void main(String[] args) {
        int[] array = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        System.out.println(k + " largest elements: " + Arrays.toString(findKLargest(array, k)));
    }
}
