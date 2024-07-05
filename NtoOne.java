package recursion;
import java.util.*;

public class NtoOne {
    public static void numsy(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        numsy(i-1,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        numsy(n,n);

    }
    
}
