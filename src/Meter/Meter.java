package Meter;
import java.util.Scanner;


public class Meter {

    public static void main(String[] args) {

Scanner scanner = new Scanner (System.in);

System.out.print("Enter number for feet :");

int feet=scanner.nextInt();
double meter=feet/ 0.3048;

System.out.println("The meter of "+ feet +" feet is " + meter);
    }


}
