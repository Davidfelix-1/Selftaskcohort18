package NewBegining;
//BMI calculator(body max index )
import java.util.Scanner;
public class ExerciseTwelve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter number for weight in kg:   ");
        int weightInKilogram= scanner.nextInt();

        System.out.print(" Enter number for height in meters:   ");
        double heightInMeter= scanner.nextDouble();

         double B_M_I= weightInKilogram / heightInMeter* heightInMeter;

         if (B_M_I>= 18.5 && B_M_I<= 24.9){
             System.out.println("BMI between 18.5 and 24.9 according to WHO is considered normal .");
         }
         if (B_M_I< 18.5 ){
             System.out.println("BMI below 18.5 according the WHO is considered underweight ");
         }
         if (B_M_I>=25 && B_M_I<=29.9){
             System.out.println("BMI within this range according to WHO is considered overweight ");
         }
         else{
             System.out.println("BMI above 30 according to WHO is considered OBESE !");
         }


    }
}
