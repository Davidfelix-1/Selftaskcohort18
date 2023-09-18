package Functions;
 import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(" Enter number for today :");
        int today = read.nextInt();

        System.out.println(" Enter number for future date : ");
        int future = read.nextInt();

        int result = (future + today) % 7;

        switch (today){
            case 0:
        System.out.print(" today is sunday ");
            break;

            case 6:
        System.out.print(" today is saturday ");
            break;

            case 5:
        System.out.print(" today is  friday ");
            break;

            case 4:
        System.out.print(" today is  thursday ");
            break;

            case 3:
        System.out.print(" today is  wednesday ");
            break;

            case 2:
        System.out.print(" today is tuesday ");
            break;

            case 1:
        System.out.print(" today is monday ")     ;
        }

     switch (future){
         case 0:
     System.out.print(" future day is  sunday ");
        break;

         case 6:
     System.out.print(" future day is saturday");
         break;

         case 5:
     System.out.print(" future day is friday ");
         break;

         case 4:
     System.out.print(" future day is thursday ");
         break;

         case 3:
     System.out.print(" future day is wednesday");
         break;

         case 2:
     System.out.print(" future day is tuesday ");
         break;

         case 1:
     System.out.print(" future is monday");
         break;

         default:
      System.out.print("wrong input !");
        break;

     }


    }
}
