public class chocolatecount {
    public static void main(String[] args) {
        int[] chocolates = {3,2,6}; // Example input array
        int N = chocolates.length; // Number of jars
        int totalChocolatesA = calculateChocolatesForA(chocolates, N);
        System.out.println(totalChocolatesA);
    }

    public static int calculateChocolatesForA(int[] chocolates, int N) {
        int totalChocolatesA = 0;
        for (int i = 0; i < N; i++) {
            // Each jar has chocolates[i] chocolates
            // Student A picks the chocolates at positions (0, 3, 6...) from the current jar
            for (int j = 0; j < chocolates[i]; j++) {
                if (j % 3 == 0) {
                    totalChocolatesA++;
                }
            }
        }
        return totalChocolatesA;
    }
}