import java.util.*;
public class OptimalMovezerostoend {
    public static void zerenda(int[] arr){
        int n=arr.length;
        int a=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[a]=arr[i];
                a++;
            }
        }
        for(int i=a;i<n;i++){
            arr[i]=0;
        }


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of array elements: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        zerenda(arr);
        System.out.println("The array with zeros at end is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    
}
