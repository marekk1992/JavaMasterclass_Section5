package exercises.firstLastDigitSum;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        if (number < 10) {
            return number * 2;
        }

        int lastNumber = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        int firstNumber = number;
        return firstNumber + lastNumber;
    }
}
