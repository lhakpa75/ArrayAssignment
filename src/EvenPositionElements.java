//21)Program to print the elements of an array present on even
//position
public class EvenPositionElements {
    public static void printEvenPosition(int[] array) {
        System.out.print("Elements at even positions: ");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        printEvenPosition(array);
    }
}
