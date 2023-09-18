package NumbersOfDays;
import java.util.Scanner;
public class NumbersOfDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter number for today : ");
        int today = input.nextInt();

        System.out.print(" enter number for future : ");
        int future = input.nextInt();

        int result = today + future % 7;
            switch (today){
                case 0:
            System.out.print(" today is sunday ");
                break;

                case 6:
            System.out.print(" today is saturday ");
                break;

                case 5:
            System.out.print(" today is friday ");
                break;

                case 4:
            System.out.print(" today is thursday ");
                break;

                case 3:
            System.out.print(" today is wednesday ");
                break;

                case 2:
            System.out.print(" today is tuesday ");
                break;

                case 1:
            System.out.print(" today is monday ");
                break;
            }




            switch (result){
                case 1:
            System.out.print(" future day is monday");
                break;

                case 2:
             System.out.print(" future day is tuesday ");
                break;

                case 3:
             System.out.print(" future day is wednesday ");
                break;

                case 4:
             System.out.print(" future day is thursday ");
                break;

                case 5:
             System.out.print(" future day is friday ");
                break;

                case 6:
             System.out.print("  future day is Saturday ");
                break;

                case 0:
             System.out.print( "  future is day sunday ");
                break;



        }
        }

    }

