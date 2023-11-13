package NewBegining;

import java.util.Scanner;

public class ExerciseEight {

    public static void main(String[] args) {

        //check if the second number is a multiple of the first number


        Scanner sc = new Scanner(System.in);



        System.out.print(" Enter first number :  ");
        int firstNumber = sc.nextInt();




        System.out.print(" Enter  second number to check if it the multiple of first number  :  ");
        int secondNumber = sc.nextInt();


        if (firstNumber *3 / secondNumber *2 ==0){
            System.out.println("second number is the multiple of the first number");
        }
        else{
            System.out.println("Is not a multiple of the first number !");
        }
    }
}