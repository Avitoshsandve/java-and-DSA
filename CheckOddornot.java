import java.util.*;

public class CheckOddornot {
    public static boolean isodd(int n) {
        return (n & 1) == 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (isodd(n)) {
            System.out.println(n + " is a odd number");
        } else {
            System.out.println(n + " is even number");
        }

    }

}
