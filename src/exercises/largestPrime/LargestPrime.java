package exercises.largestPrime;

public class LargestPrime {

    public static int getLargestPrimeVersion2(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = 2;
        for (int i = number; i > 2; i--) {
            if (number % i == 0 && isPrime(i)) {
                largestPrime = i;
                break;
            }
        }
        return largestPrime;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
