import java.util.*;
public class largestelementsarray {
    public static int largestele(int[] arr){
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("The largest element is:");
        System.out.println(largestele(arr));
    }

    
}
