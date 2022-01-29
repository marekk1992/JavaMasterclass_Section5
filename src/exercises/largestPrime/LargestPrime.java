package exercises.largestPrime;

public class LargestPrime {

    public static int getLargestPrimeVersion1(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = 2;
        for (int i = number; i > 2; i--) {
            if (number % i == 0) {
                int prime = 0;
                for (int j = 2; j <= (long) Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        prime = -1;
                    }
                }
                if (prime == 0) {
                    largestPrime = i;
                    break;
                }
            }
        }
        return largestPrime;
    }

    public static int getLargestPrimeVersion2(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = 2;
        for (int i = number; i > 2; i--) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    largestPrime = i;
                    break;
                }
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
