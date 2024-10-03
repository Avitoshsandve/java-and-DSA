 import java.util.*;
 public class RightrotatearraybyKsteps{
    public static void rotateit(int[] arr,int A,int B){
        while(A<B){
        int temp=arr[A];
        arr[A]=arr[B];
        arr[B]=temp;
        A++;
        B--;
        }


    }
    public static void baigan(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        rotateit(arr, 0, n-1);
        rotateit(arr, 0, k-1);
        rotateit(arr,k,n-1);

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("No. of steps to rotate array: ");
        int k=sc.nextInt();
        baigan(arr,k);
        System.out.println("The array right rotated by "+k+" steps is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }
 }