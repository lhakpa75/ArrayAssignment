//10) Write a Java program to remove duplicate elements from an array
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));
        int[] newArray = removeDuplicates(array);
        System.out.println("Array without duplicates: " + Arrays.toString(newArray));
    }
}

