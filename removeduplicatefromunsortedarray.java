import java.util.*;

public class removeduplicatefromunsortedarray {
    public static int dupli(int[] arr){
        Arrays.sort(arr);
        int n =arr.length;
        int i=0,j=1;
        while(j<n){
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];

            }
            j++;
        }
        return i+1;

        


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the sorted array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int newbie=dupli(arr);
        
        System.out.println("The sorted array with no duplicates is: ");
        for(int i=0;i<newbie;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }

}
    

