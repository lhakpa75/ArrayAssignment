//22) Program to print the elements of an array present on odd position
public class OddPositionElements {
    public static void printOddPosition(int[] array) {
        System.out.print("Elements at odd positions: ");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        printOddPosition(array);
    }
}

