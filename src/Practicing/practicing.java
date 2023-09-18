package Practicing;
import java.util.Scanner;
public class practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("enter second number:  ");
        int number2 = sc.nextInt();

        int sum = number1 * number2;
        System.out.printf("sum is %d%n", sum);
    }
}