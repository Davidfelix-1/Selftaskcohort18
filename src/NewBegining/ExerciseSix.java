package NewBegining;

import java.util.Scanner;
public class ExerciseSix {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number1:   ");
        int num1 = sc.nextInt();

        System.out.print("Enter number2:   ");
        int num2 = sc.nextInt();

        System.out.print("Enter number3:   ");
        int num3 = sc.nextInt();

        System.out.print("Enter number4:   ");
        int num4 = sc.nextInt();

        System.out.print("Enter number5:   ");
        int num5 =sc.nextInt();


        if (num2 > num1){
            System.out.println(num2);
        }
        if (num3 > num2){
            System.out.println(num3);
        }
        if (num4 > num3){
            System.out.println(num4);
        }
        if (num5 > num4){
            System.out.println("The largest number is "+num5);
        }

    }
}
