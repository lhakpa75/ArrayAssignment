//4) Write a Java program to remove a specific element from an array
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 20, 30, 40, 50};

        System.out.print("Enter the element to remove: ");
        int element = scanner.nextInt();

        int[] newArray = removeElement(array, element);

        if (newArray.length == array.length) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.print("New array after removing element: ");
            for (int i : newArray) {
                System.out.print(i + " ");
            }
        }
    }

    public static int[] removeElement(int[] array, int element) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count++;
            }
        }

        if (count == 0) {
            return array;
        }

        int[] newArray = new int[array.length - count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                newArray[index++] = array[i];
            }
        }

        return newArray;
    }
}
