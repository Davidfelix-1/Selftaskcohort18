package LoopPractice;

public class LoopPractice {
    public static void main(String[] args){

    System.out.println("Group A");
        for (int i=1; i<=6; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
        System.out.println("");
        }
        System.out.println("");


        System.out.println("Group B");
        for (int i = 6; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Group C");
        for (int i = 1; i <=6; i++) {
            String line = "";
            for (int j = 1; j <=i ; j++) {
                line += j + " ";
            }
                System.out.printf("%12s%n", line);
            }
            System.out.println("");

        System.out.println(" Group D");

        for (int i = 6; i < 1; i--) {
            String line = "";
            for(int j = 1; j <=i; j++){
                line += j + "";
            }
            System.out.printf("%12s%n", line);

        }
    }
}