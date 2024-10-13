import java.util.*;

public class hallowweecandies {
    public static int candiecount(int[] arr, int n, int m) {
        n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (m < arr.length && arr[m] % 5 == 0) {
                count++;
            } else {
                if (m >= arr[i]) {
                    m = m - arr[i];
                    count++;
                } else {
                    break;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of candies bob is buying:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of candies.");
            return;
        }
        System.out.println("Enter the prices of the candies:");
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("Enter the amount of money Bob has:");
        int m = sc.nextInt();

        int result = candiecount(prices, n, m);
        System.out.println("Maximum number of candies Bob can buy: " + result);

    }

}