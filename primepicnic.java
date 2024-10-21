public class primepicnic {
    public static void main(String[] args) {
        int N = 10; // Example input
        int result = sumOfPrimes(N);
        System.out.println(result);
    }

    public static int sumOfPrimes(int N) {
        if (N <= 1) {
            return 0; 
        }

        int sum = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                sum += i; 
            }
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true; 
    }
}