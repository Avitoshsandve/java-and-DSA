import java.util.*;
public class sumofeventermsinarr {
    public static int sumarr(int[] arr,int n){
        n=arr.length;
        reverse(arr);
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum=sum+arr[i];

            }

        }
        return sum;
    }
    public static void reverse(int[] arr){
        int n=arr.length;
    int a=0;
    int b=n-1;
    while(a<b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        a++;
        b--;
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length od array: ");
    int n=sc.nextInt();
    System.out.println("Enter array elements: ");
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int result=sumarr(arr, n);
    System.out.println("The sum of even indexed eleemnts reversed is: "+result);
}
}