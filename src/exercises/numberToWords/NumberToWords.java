package exercises.numberToWords;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int printedDigitsCounter = 0;
        int reversedNumber = reverse(number);

        while (printedDigitsCounter != getDigitCount(number)) {
            String numberValue = "" + reversedNumber % 10;
            switch (numberValue) {
                case "0":
                    System.out.println("Zero");
                    break;
                case "1":
                    System.out.println("One");
                    break;
                case "2":
                    System.out.println("Two");
                    break;
                case "3":
                    System.out.println("Three");
                    break;
                case "4":
                    System.out.println("Four");
                    break;
                case "5":
                    System.out.println("Five");
                    break;
                case "6":
                    System.out.println("Six");
                    break;
                case "7":
                    System.out.println("Seven");
                    break;
                case "8":
                    System.out.println("Eight");
                    break;
                case "9":
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }
            printedDigitsCounter++;
            reversedNumber /= 10;
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse += number % 10;
            if (number >= 10 || number <= -10) {
                reverse = reverse * 10;
            } else {
                break;
            }
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int digitCounter = 0;
        if (number == 0) {
            digitCounter = 1;
        }
        while (number != 0) {
            digitCounter++;
            number /= 10;
        }

        return digitCounter;
    }
}
