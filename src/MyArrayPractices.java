import java.util.*;
import java.util.Scanner;
public class MyArrayPractices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter five or more digits ");

        int [] arr1 ={5, 6, 3, 4, 5};

        Arrays.sort(arr1);
        for(int i: arr1){
            System.out.print(i + " ");
        }
    }
}

