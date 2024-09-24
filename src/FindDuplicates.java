//7) Write a Java program to find the duplicate values of an array of integer values
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 20, 40, 50, 10};

        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (!uniqueElements.add(array[i])) {
                duplicateElements.add(array[i]);
            }
        }

        if (!duplicateElements.isEmpty()) {
            System.out.println("Duplicate values in the array: " + duplicateElements);
        } else {
            System.out.println("No duplicate values found.");
        }
    }
}