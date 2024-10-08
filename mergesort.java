import java.util.*;
public class mergesort {
    public static void merge(int[] arr,int low,int mid,int high){
        int n=arr.length;
        int i=low;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                i++;
            }
            else{
                int val=arr[j];
                int ind=j;
                while(ind!=i){
                    arr[ind]=arr[ind-1];
                    ind--;
                    
                }
                arr[i]=val;
                i++;
                mid++;
                j++;
            }
        }
    }
    public static void mergesort(int[]arr,int low,int high){
        if(low<high){
        int mid=(low+high)/2;
        
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);

        merge(arr,low,mid,high);

    }
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length of array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter elements of array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    mergesort(arr,0,n-1);
    System.out.println("Sorted array");
    for(int num:arr){
        System.out.println(num+" ");
    }
}
    
    
}
