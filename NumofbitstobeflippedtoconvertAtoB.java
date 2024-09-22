import java.util.*;

public class NumofbitstobeflippedtoconvertAtoB {
    public static int bitsflipped(int A, int B) {
        int ans = A ^ B;
        int count = 0;
        while (ans > 0) {
            count += ans & 1;
            ans >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:  ");
        int n1 = sc.nextInt();
        System.out.println("Entet the second number: ");
        int n2 = sc.nextInt();
        int result = bitsflipped(n1, n2);
        System.out.println("The number of bits flipped are: " + result);

    }

}
