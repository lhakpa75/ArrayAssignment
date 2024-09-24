//23) Program to print the sum of all the elements of an array
public class SumOfArray {
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + sumOfArray(array));
    }
}
