package NewBegining;
import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter a number to check if its divisible by 3:  ");
        int number = sc.nextInt();

        if (number %3 == 0){
            System.out.print(" Number is divisible by 3 ");
        }
        else{
            System.out.println(" The number you entered is not divisible by 3");
        }
    }
}
