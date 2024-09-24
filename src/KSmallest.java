//15) Write a Java program to find the k smallest elements in a given
//array. Elements in the array can be in any order
import java.util.Arrays;

public class KSmallest {
    public static int[] findKSmallest(int[] array, int k) {
        Arrays.sort(array);
        return Arrays.copyOfRange(array, 0, k);
    }

    public static void main(String[] args) {
        int[] array = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        System.out.println(k + " smallest elements: " + Arrays.toString(findKSmallest(array, k)));
    }
}
