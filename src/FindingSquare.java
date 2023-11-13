public class FindingSquare {

    int sides ;



    FindingSquare(){
        sides = 40;
    }

    void displayResult(){

        int area = 2+ sides * sides ;

        System.out.println("The square of the area is ="+ area);
    }

    void displayResultTwo(){
         int multiply = 2* sides * sides ;

        System.out.println("the multiplication of szides ="+multiply);
    }

    public static void main(String[] args) {
        FindingSquare findingSquare = new FindingSquare();


        findingSquare.displayResult();
        findingSquare.displayResultTwo();

    }
}
