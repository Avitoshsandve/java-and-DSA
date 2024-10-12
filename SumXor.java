import java.util.*;
public class SumXor {
    public static int diffsum(int[] arr,int n){
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                b=b^arr[i];
            }
            else{
                a=a+arr[i];
            }
        }
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of array elements: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=diffsum(arr, n);
        System.out.println("The difference of them is: "+result);



    }

    
}
