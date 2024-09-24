//9) Write a Java program to find the common elements between two arrays (string values)
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {

        String[] array1 = {"apple", "banana", "orange", "grape", "melon"};
        String[] array2 = {"kiwi", "banana", "grape", "apple", "pineapple"};

        findCommonElements(array1, array2);
    }

    public static void findCommonElements(String[] array1, String[] array2) {

        Set<String> set1 = new HashSet<>();
        for (String element : array1) {
            set1.add(element);
        }

        Set<String> commonElements = new HashSet<>();

        for (String element : array2) {
            if (set1.contains(element)) {
                commonElements.add(element);
            }
        }

        if (!commonElements.isEmpty()) {
            System.out.println("Common elements between the two arrays: " + commonElements);
        } else {
            System.out.println("No common elements found.");
        }
    }
}