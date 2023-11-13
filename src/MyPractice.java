import java.util.Scanner;
public class MyPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:  ");
        int firstNumber=scanner.nextInt();

        System.out.print("Enter second number:  ");
        int secondNumber=scanner.nextInt();

        int product= firstNumber * secondNumber;
        if (product%2 ==0) {
            System.out.println("the product is even number!");
        }
        else{
            System.out.println("the product is odd number! ");
        }
        System.out.printf("The product of your input is %d%n",product);
    }
}
