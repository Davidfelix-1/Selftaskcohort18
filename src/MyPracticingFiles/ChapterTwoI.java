package MyPracticingFiles;
import java.util.Scanner;


public class ChapterTwoI {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:   ");
        int x = scanner.nextInt();

        System.out.print("Enter second number:  ");
        int y = scanner.nextInt();

        System.out.print("Enter third number:  ");
        int z = scanner.nextInt();

        int product = x*y*z;

        System.out.printf("the product of your input is %d%n",product);

    }
}
