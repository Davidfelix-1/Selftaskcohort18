public class AnagramFunction {

    public static boolean isPalindrome(String str) {
        int givenWord = str.length();
        for (int count = 0; count < givenWord; count++) {
            if (str.charAt(count) != str.charAt(givenWord - count - 1)) {
                return false;
            }
        }
        return true;
    }
}


