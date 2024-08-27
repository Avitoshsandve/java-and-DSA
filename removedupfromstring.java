import java.util.*;

public class removedupfromstring {
    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!seen.contains(currentChar)) {
                result.append(currentChar);
                seen.add(currentChar);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        
        String result = removeDuplicates(s);
        System.out.println("The string with no duplicates is: " + result);
    }
}
