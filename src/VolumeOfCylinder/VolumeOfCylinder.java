package VolumeOfCylinder;
import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print(" enter figure for radius and length : ");

        double radius =sc.nextDouble();
        double length =sc.nextDouble();
       double  area= radius * radius ;
       double volume = area * length ;

       System.out.println("The volume of a cylinder " +volume);


    }
}
