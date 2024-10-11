import java.util.*;
import java.util.Scanner;

public class sepreateodeveninarray {
    public static String spe(int[] arr, int n) {
        n = arr.length;
        StringBuilder avi=new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                avi.append("Even  ");

            } else {
                avi.append("odd ");

            }

        }
        return avi.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of array elements: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String result=spe(arr, n);
        System.out.println("THe number is "+result);

    }

}
