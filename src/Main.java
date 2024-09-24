import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Write a Java program to calculate the average value of array");
        //Solution:
        System.out.print("Enter total array size:");
        int x = scanner.nextInt();

        int[] array = new int[x];
        int sum = 0;

        for (int i = 0; i < x; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        double average = (double) sum/ x;
        System.out.println("The average is value of Array is " + average);

        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("2) Write a Java program to test if an array contains a specific value");

        System.out.print("Enter a value to test if it is an array: ");
        int num = scanner.nextInt();
        int[] a = {10,20,30,40,50};

        boolean contains = false;
        for (int element : a) {
            if (element == num) {
                contains = true;
                break;
            }
        }
        if (contains) {
            System.out.println("The array contains " + num );
        } else {
            System.out.println("The array does not contain " + num );
        }

    }

}