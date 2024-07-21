import java.util.*;
public class palindrome {
    public static void palind(String s) {
        StringBuilder pali = new StringBuilder(s);
        String reversed = pali.reverse().toString();
        if (s.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the string:");
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        if (s.length() != n) {
            System.out.println("Invalid string length.");
            return; 
        }
        System.out.println("Entered string:");
        System.out.println(s);
        
        palind(s);

        
    }
}
