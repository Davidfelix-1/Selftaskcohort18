package NewBegining;
import java.util.Scanner;

public class ExerciseThree {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);




        System.out.print("Enter an integer numberOne:    ");
        int a = input.nextInt();
        System.out.print("Enter an integer  numberTwo:    ");
        int b = input.nextInt();


        int c =a * b;


        System.out.println("The product of input is "+c);


    }
}
