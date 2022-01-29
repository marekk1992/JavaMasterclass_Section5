package exercises.lastDigitChecker;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }

        int lastDigit1 = firstNumber % 10;
        int lastDigit2 = secondNumber % 10;
        int lastDigit3 = thirdNumber % 10;
        return lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
