package NewBegining;
import java.util.Scanner;


public class DataArray {
    public static void main(String[] args) {

        int [] priceOfPen = new int [5];

        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < priceOfPen.length ; i++)
            priceOfPen[i]= sc.nextInt();

        for (int j : priceOfPen) System.out.println(j + " ");

        }
    }

