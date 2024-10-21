import java.util.HashMap;
import java.util.Map;

public class permutationcount {

    // Method to remove vowels from a string
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    // Method to calculate the factorial of a number
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate the number of permutations of a string
    public static long calculatePermutations(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Calculate the numerator (n!)
        long numerator = factorial(str.length());

        // Calculate the denominator (c1! * c2! * ...)
        long denominator = 1;
        for (int count : charCount.values()) {
            denominator *= factorial(count);
        }

        return numerator / denominator; // Return number of permutations
    }

    // Method to find the maximum permutation count from the string array
    public static int maxPermutationValue(String[] arr) {
        long maxPermutations = 0;

        for (String s : arr) {
            String consonantsOnly = removeVowels(s);
            if (consonantsOnly.length() > 0) {
                long permutations = calculatePermutations(consonantsOnly);
                maxPermutations = Math.max(maxPermutations, permutations);
            }
        }

        // If there are no valid strings, return 0
        return (maxPermutations > 0) ? (int) maxPermutations : 0;
    }

    public static void main(String[] args) {
        // Example input
        String[] inputStrings = {"hello", "world", "java", "programming"};
        
        // Calculate and print the maximum permutation value
        int maxPermValue = maxPermutationValue(inputStrings);
        System.out.println("Maximum Permutation Value: " + maxPermValue);
    }
}