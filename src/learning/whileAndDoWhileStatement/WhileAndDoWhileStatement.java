package learning.whileAndDoWhileStatement;

public class WhileAndDoWhileStatement {

    public static void main(String[] args) {

        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int counter = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);

            counter++;
            if (counter == 5) {
                break;
            }
        }
        System.out.println("Total number of even numbers = " + counter);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
