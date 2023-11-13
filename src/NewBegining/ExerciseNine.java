package NewBegining;
//Separating integers in
public class ExerciseNine {
    public static void main(String[] arg) {


        int number = 12345;

        separateAndDisplayDigits(number);
    }



        public static void separateAndDisplayDigits(int num){

        //remember convert integer to string for a proper manipulation (mr picasso)
            String numberString = Integer.toString(num);


        // then we iterate through each character in the string (mr picasso)

            for (int i = 0; i < numberString.length(); i++) {
                //extract strings by converting them back to an integer

                int digit = Character.getNumericValue(numberString.charAt(i));




                System.out.println("The digit " +(i+1)+ ": " + digit);
            }



    }
}
