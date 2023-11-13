package MyPracticingFiles;
import java.util.Scanner;
public class ChapterTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:  ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:  ");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.printf("%d == %d%n",num1, num1);
        }
        if(num1 != num2){
            System.out.printf("%d != %d%n",num1, num2);
        }
        if(num1 < num2){
            System.out.printf("%d < %d%n", num1, num2);
        }
        if(num1 > num2){
            System.out.printf("%d > %d%n",num1, num2);
        }
        if(num1 <= num2){
            System.out.printf("%d <= %d%n", num1, num2);
        }
        if(num1 >= num2){
            System.out.printf("%d => %d%n",num1, num2);
        }
    }
}
