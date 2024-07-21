import java.util.*;

public class reversewordsofstring {
    public static String revword(String s) {
        String[] arr = s.split(" ");
        StringBuilder rev = new StringBuilder();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            rev.append(arr[i]);

            if (i != 0) {
                rev.append(" ");

            }
        }

        return rev.toString().trim();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of String");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string");
        String s = sc.nextLine();
        if (s.length() != n) {
            System.out.println("Invalid string");
        }
        System.out.println("Entered string");
        System.out.println(s);
        String rev = revword(s);
        System.out.println("Reversed words string: ");
        System.out.println(rev);

    }

}
