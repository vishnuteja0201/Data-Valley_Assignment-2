int a = 200, b = 300;
public class Main {
    public static void main(String[] args) {
        int a = 200, b = 300;
        System.out.println("Before swapping - a: " + a + ", b: " + b);
        swapNumbersWithoutTempVariable(a, b);
    }

    public static void swapNumbersWithoutTempVariable(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping - a: " + a + ", b: " + b);
    }
}
