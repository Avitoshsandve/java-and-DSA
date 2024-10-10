import java.util.*;

public class optimal2pointerapproachfor2sumproblem {
    public static void twosomes(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr); 
        int a = 0; 
        int b = n - 1; 
        
        while (a < b) {
            int sum = arr[a] + arr[b]; 
            if (sum == target) {
                System.out.println("Found the pair: " + arr[a] + ", " + arr[b]); 
                return; 
            } else if (sum < target) {
                a++; 
            } else {
                b--; 
            }
        }
        
        System.out.println("No pair exists for sum to be: " + target); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt(); 
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        System.out.println("The target is: ");
        int target = sc.nextInt(); 
        
        
        twosomes(arr, target);
    }
}
