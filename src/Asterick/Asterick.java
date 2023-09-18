package Asterick;

public class Asterick {

    public static void main(String[] arg) {


        System.out.print("\n\nPattern A");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.print("\n\nPattern B");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.print("\n\nPattern C");
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.print("\n\nPattern D");
        for (int i = 1; i <= 6; i++) {
            for (int k = i; k > 1; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}