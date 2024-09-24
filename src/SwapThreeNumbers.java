//17) Swap three numbers with temporary variable
public class SwapThreeNumbers {
    public static void swapNumbers(int a, int b, int c) {
        int temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("After swap: a = " + a + ", b = " + b + ", c = " + c);
    }

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        System.out.println("Before swap: a = " + a + ", b = " + b + ", c = " + c);
        swapNumbers(a, b, c);
    }
}
