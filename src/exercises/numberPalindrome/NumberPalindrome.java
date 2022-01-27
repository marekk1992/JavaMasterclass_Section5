package exercises.numberPalindrome;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int original = number;
        while (number != 0) {
            reverse += number % 10;
            if (number >= 10 || number <= -10) {
                reverse = reverse * 10;
            } else {
                break;
            }
            number /= 10;
        }

        return original == reverse;
    }
}
