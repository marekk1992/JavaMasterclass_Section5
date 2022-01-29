package exercises.greatestCommonDivisor;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int biggerNumber;
        int lowerNumber;

        if (first >= second) {
            biggerNumber = first;
            lowerNumber = second;
        } else {
            biggerNumber = second;
            lowerNumber = first;
        }

        int greatestCommonDivisor = lowerNumber;
        for (int i = greatestCommonDivisor; i > 0; i--) {
            if (biggerNumber % i == 0 && lowerNumber % i == 0) {
                greatestCommonDivisor = i;
                break;
            }
        }
        return greatestCommonDivisor;
    }
}