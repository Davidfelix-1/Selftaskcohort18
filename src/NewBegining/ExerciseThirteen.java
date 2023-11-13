package NewBegining;

//calculating world population  Growth
import java.util.Scanner;

public class ExerciseThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        long currentWorldPopulation= scanner.nextLong();

        System.out.print("Enter previous world population: ");
        long previousWorldPopulation= scanner.nextLong();


        //long worldPopulationGrowth =(currentWorldPopulation - previousWorldPopulation) / previousWorldPopulation * 100;
        double worldPopulationGrowth = 100*previousWorldPopulation/(currentWorldPopulation-previousWorldPopulation);

        System.out.println("World population growth is "+worldPopulationGrowth);
    }
}
