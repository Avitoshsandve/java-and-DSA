import java.util.*;
public class bubblesort{
    public static void bubble(int[] arrey){
        int n=arrey.length;
        for(int i=0;i<n-1;i++){
            int max=i;
            for(int j=0;j<n-1-i;j++){
                if(arrey[j]>arrey[j+1])
                {
                    max=j;
                    int temp=arrey[j];
                    arrey[j]=arrey[j+1];
                    arrey[j+1]=temp;


                }
            }

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
        bubble(arrey);
        System.out.println("sorted array");
        for(int num:arrey){
            System.out.println(num+" ");
        }

    }
}
