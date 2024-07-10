import java.util.*;

public class insertionsort {
    public static void inserti(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;


        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int[] arrey=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arrey[i]=sc.nextInt();
        }
        inserti(arrey);
        System.out.println("sorted array");
        for(int num:arrey){
            System.out.println(num+" ");
        }

    }
    
}
