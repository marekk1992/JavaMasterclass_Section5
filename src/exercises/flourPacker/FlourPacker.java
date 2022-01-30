package exercises.flourPacker;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int sum = 0;
        int requiredAmount = goal;
        int valueOfBigBag = 5;
        int valueOfSmallBag = 1;

        while (sum != goal) {
            if (requiredAmount >= valueOfBigBag && bigCount > 0) {
                sum += valueOfBigBag;
                requiredAmount -= valueOfBigBag;
                bigCount--;

            } else if (smallCount > 0) {
                sum += valueOfSmallBag;
                requiredAmount -= valueOfSmallBag;
                smallCount--;
            } else {
                return false;
            }
        }

        return sum == goal;
    }
}
