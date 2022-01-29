package exercises.sharedDigit;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (!isValid(firstNumber) || !isValid(secondNumber)) {
            return false;
        }

        int original = secondNumber;
        while (firstNumber != 0) {
            int digit = firstNumber % 10;
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

    public static boolean isValid(int number) {
        return number > 10 && number < 99;
    }
}
