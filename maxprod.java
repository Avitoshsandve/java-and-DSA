import java.util.*;

public class maxprod {
    public static int[] prodmax(int[] arr) {
        int n = arr.length;
        int maxx=0;
        int[] avi=new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;i<n;i++){
                if(arr[i]+arr[j]==18){
                    int temp=arr[i]*arr[j];
                    if(temp>maxx){
                        maxx=temp;
                        avi[0]=arr[i];
                        avi[1]=arr[j];
                    }
                }
            }
        }
        Arrays.sort(avi);
        return avi;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=prodmax(arr);
        System.out.println("THe pair with sum of 18 and highest product is : "+result[0]+"and "+result[1]);

    }

}
