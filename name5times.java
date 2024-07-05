package recursion;
import java.util.*;

public class name5times {
    public static void namis( int i,int n){
        if(i> n)
        {
            return;
            
        }
        System.out.println("Avito");
        namis(i+1,n);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value ");
        int n=sc.nextInt();
        namis(0,n);

    }

    
}
