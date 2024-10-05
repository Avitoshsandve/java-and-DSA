import java.util.Scanner;

public class rightrotatebynestep {
    public static void riror(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of array elements: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        riror(arr);
        System.out.println("The right rotated array by one step is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();


    }
    
}
