import java.util.*;

public class Twosumproblem {
    public static void teosome(int[] arr,int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                    
                } else {
                    if(arr[i]+arr[j]==target){
                        System.out.println("two elements are: "+arr[i]+", "+arr[j]);
                        return;


                    }
                    

                }
            }

        }
        System.out.println("no pair found for sum to be " + target);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The taregt is: ");
        int target=sc.nextInt();
        teosome(arr, target);
    }

}
