//8) Write a Java program to find the duplicate values of an array of string values
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateStrings {
    public static void main(String[] args) {

        String[] array = {"apple", "banana", "orange", "apple", "grape", "banana", "melon"};

        findDuplicates(array);
    }

    public static void findDuplicates(String[] array) {
        Set<String> uniqueElements = new HashSet<>();
        Set<String> duplicateElements = new HashSet<>();

        for (String element : array) {
            if (!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }

        if (!duplicateElements.isEmpty()) {
            System.out.println("Duplicate values in the array: " + duplicateElements);
        } else {
            System.out.println("No duplicate values found.");
        }
    }
}
