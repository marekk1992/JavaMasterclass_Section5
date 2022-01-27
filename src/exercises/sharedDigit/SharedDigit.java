package exercises.sharedDigit;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        int digit;
        int original = secondNumber;
        while (firstNumber != 0) {
            digit = firstNumber % 10;
            while (secondNumber != 0) {
                if (digit == secondNumber % 10) {
                    return true;
                }
                secondNumber /= 10;
            }
            secondNumber = original;
            firstNumber /= 10;
        }

        return false;
    }
}
