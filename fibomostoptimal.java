import java.util.*;
public class fibomostoptimal {
    public static long fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int prev2=0;
        int prev=1;
        
        for (int i = 2; i <= n; i++) {
            int curr1=prev+prev2;
            prev2=prev;
            prev=curr1;
        }
        return prev;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Position of fibo number?");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid");
        } else {
            long result = fibo(n);
            System.out.println("The fibo number at " + n + " is: " + result);
        }
    }
    
}
