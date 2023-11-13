package NewBegining;
import java.util.Scanner;
public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner semi = new Scanner(System.in);

        System.out.println(" Enter a number :  ");
        System.out.println("Number\t Square\t Cube");

        int number = semi.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println(number+"\t"+number*number+"\t"+number*number*number);

        }




    }
}
