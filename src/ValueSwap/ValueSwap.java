package ValueSwap;

public class ValueSwap {
    public static void main(String[] args) {


        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;

        int emp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = emp;


        System.out.println(firstNumber );
        System.out.println(secondNumber);
        System.out.println(thirdNumber);




    }
}
