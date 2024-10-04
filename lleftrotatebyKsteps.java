import java.util.*;
public class lleftrotatebyKsteps {
    public static void Avito(int[] arr,int A ,int B){
        while(A<B){
            int temp=arr[A];
            arr[A]=arr[B];
            arr[B]=temp;
            A++;
            B--;

        }





    }
    public static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        Avito(arr, 0, n-k-1);
        Avito(arr, n-k, n-1);
        Avito(arr,0,n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of array elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter no. of steps to left rotate by");
        int k=sc.nextInt();
        rotate(arr, k);
        System.out.println("THe array after left rotating by "+k+" steps is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }
    
}
