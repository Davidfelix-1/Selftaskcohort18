package fahrenheit;
import   java.util.Scanner;
public class fahrenheitCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter number for Celsius: ");
        double number =input.nextDouble();
        double celsius= number;
        double fahrenheit =(9/5)* celsius + 32 ;

        System.out.println(" fahrenheit " + fahrenheit + " celsius " +celsius);


    }


}
