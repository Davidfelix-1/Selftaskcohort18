package NewBegining;
import java.util.Scanner;

public class FindingMinimumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first digit :  ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second digit :  ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third digit ;   ");
        int num3 = scanner.nextInt();

        int minimum;
        minimum = num1;

        if (num2 < minimum){
            System.out.print("the minimum is "+num2);
        }
        if (num3 < minimum){
            System.out.print("the minimum is "+num3);
        }
        System.out.println("the minimum is : "+minimum);

    }
}
