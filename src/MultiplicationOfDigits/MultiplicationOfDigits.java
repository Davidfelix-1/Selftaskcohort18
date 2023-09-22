package MultiplicationOfDigits;

public class MultiplicationOfDigits {
    public static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        boolean isNegative = (a < 0) ^ (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        int result = 0;
        for (int i = 0; i < a; i++) {
            result += b;
        }
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int product = multiply(a, b);
        System.out.println("Product: " + product);
    }
}



