package NewBegining;
import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first digit:  ");
        int num1 = scanner.nextInt();
        System.out.println(" Enter second digit:  ");
        int num2=scanner.nextInt();

        if (num1 == num2){
            System.out.printf(" %d ==  %d ", num1, num2);
        }
        if (num1 != num2){
            System.out.printf(" %d != %d ", num1, num2);
        }
        if (num1 < num2){
            System.out.printf(" %d < %d ", num1, num2);
        }
        if (num1 > num2){
            System.out.printf(" %d > %d ", num1, num2);
        }
        if (num1 <= num2){
            System.out.printf(" %d <= %d ", num1, num2);
        }
        if (num1 >= num2){
            System.out.printf(" %d >= %d ", num1, num2);
        }

    }
}
