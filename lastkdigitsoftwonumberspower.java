import java.util.*;

public class lastkdigitsoftwonumberspower {
    public static int lastdo(int a, int b, int k) {
        int mod = (int) Math.pow(10, k);
        return modularexponent(a, b, mod);
    }

    public static int modularexponent(int a, int b, int mod) {
        int result = 1;
        a = a % mod;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % mod;
            }
            b = b >> 1;
            a = (a * a) % mod;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = sc.nextInt();
        System.out.println("Enter the power number: ");
        int power = sc.nextInt();
        System.out.println("Enter the number of last digits to find: ");
        int k = sc.nextInt();
        int result = lastdo(base, power, k);
        System.out.println("The last " + k + " digits are: " + result);

    }

}
