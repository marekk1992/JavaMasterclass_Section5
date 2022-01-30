package exercises.inputCalculator;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                sum += scanner.nextInt();
                counter++;
            }
            else {
                break;
            }
            scanner.nextLine();
        }

        long avg = Math.round((double) sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
