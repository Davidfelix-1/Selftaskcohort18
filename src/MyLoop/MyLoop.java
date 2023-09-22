package MyLoop;

public class MyLoop {
    public static void main(String[] args) {
        for(int x =1; x<=12; x++){
            for(int j =1; j<=12; j++){
                System.out.printf("%4d",x*j);
            }
            System.out.println();
        }

    }
}
