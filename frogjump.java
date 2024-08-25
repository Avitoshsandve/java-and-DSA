import java.util.*;

public class frogjump {

    public static int frju(int n, int[] height, int[] jumps) {
        if (n == 0) {
            return 0;
        }
        if (jumps[n] != -1) {
            return jumps[n];
        }

        int jumpOne = frju(n - 1, height, jumps) + Math.abs(height[n] - height[n - 1]);

        int jumpTwo = Integer.MAX_VALUE;
        if (n > 1) {
            jumpTwo = frju(n - 2, height, jumps) + Math.abs(height[n] - height[n - 2]);
        }

        return jumps[n] = Math.min(jumpOne, jumpTwo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of stairs:");
        int n = sc.nextInt();

        int[] height = new int[n];
        System.out.println("Enter the heights of the stairs:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int[] jumps = new int[n];
        Arrays.fill(jumps, -1);

        int result = frju(n - 1, height, jumps);

        System.out.println("Minimum energy required to reach the last stair is: " + result);
    }
}
