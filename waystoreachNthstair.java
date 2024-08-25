import java.util.*;

public class waystoreachNthstair {
    public static int stairs(int n) {
        if (n == 0) {
            return 1;

        }
        if (n == 1) {
            return 0;
        }
        int left = stairs(n - 1);
        int right = stairs(n - 2);

        return left + right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Stairs: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid");
        } else {
            long result = stairs(n);
            System.out.println("The number of ways  to react nth stair are " + result);
        }
    }

}
