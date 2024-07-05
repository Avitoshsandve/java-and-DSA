package recursion;
import java.util.*;

public class sumofNnumbers {
    public static void addisum(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        
        }
        addisum(i-1,sum+i);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        addisum(n,0);

    }
    

    
}