import java.util.*;
public class selectionsort{
    public static void selec(int [] arru){
        int n=arru.length;
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arru[j]<arru[i]){
                    mini=j;

                }

            }
            int temp=arru[mini];
            arru[mini]=arru[i];
            arru[i]=temp;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int [] arru=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arru[i]=sc.nextInt();

        }
        selec(arru);
        System.out.println("sorted array");
        for(int num:arru){
            System.out.println(num+" ");
        }


    }

    
}