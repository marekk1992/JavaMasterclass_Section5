package learning.sumChallenge;

public class SumChallenge {

    public static void main(String[] args) {

        int numbersCounter = 0;
        int sum = 0;

        for (int number = 1; number <= 1000; number++) {
            if ((number % 3 == 0) && (number % 5 == 0)) {
                numbersCounter++;
                sum += number;
                System.out.println("Number " + number + " is divided by 3 and also by 5.");
            }
            if (numbersCounter == 5) {
                break;
            }
        }
        System.out.println("The sum of the numbers that can be divided by both 3 and 5 = " + sum);
    }
}
