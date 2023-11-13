package NewBegining;

import java.util.Scanner;
public class ExerciseFour {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numberOne:    ");
        int num1 = sc.nextInt();
        System.out.print("Enter numberTwo:    ");
        int num2 = sc.nextInt();

        int square = num1*2  + num2*2;
        int differences = num1*2 - num2*2;


        System.out.printf("%d%n The square of first number is: ",num1 * 2);
        System.out.printf("%d%n The square of Second number is: ",num2 * 2);

        System.out.println("The sum of input squares ="+square);
        System.out.println("The differences of input Squares ="+differences);


    }
}
