package learning.readingUserInputChallenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digitCounter = 0;
        int sum = 0;
        while (digitCounter != 10) {
            int order = digitCounter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                sum += scanner.nextInt();
                digitCounter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
