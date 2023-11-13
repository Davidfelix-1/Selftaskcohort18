import java.util.Arrays;
import java.util.Scanner;
public class EditionPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter and integer: ");
        int score= sc.nextInt();

        if (score >=90.0){
            System.out.print("A");
        } else if (score >=80.0){
            System.out.print("B");
        } else if (score >= 70.0){
            System.out.print("C");
        } else if (score >= 60.0){
            System.out.print("D");
        } else if (score >= 50.0){
            System.out.print("E");
        } else if (score >= 40.0){
            System.out.print("F9! please retake exam");

        }

    }
}