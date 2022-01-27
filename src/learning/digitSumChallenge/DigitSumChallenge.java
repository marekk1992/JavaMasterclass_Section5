package learning.digitSumChallenge;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("Sum of digits in number 125 is " + sumDigits(125));
        System.out.println("Sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("Sum of digits in number 4 is " + sumDigits(4));
        System.out.println("Sum of digits in number 32123 is " + sumDigits(32123));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sumOfDigits = 0;
        while (number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            sumOfDigits += digit;

            // drop the least-significant digit
            number /= 10;
        }

        return sumOfDigits;
    }
}
