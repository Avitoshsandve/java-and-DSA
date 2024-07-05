package recursion;
import java.util.*;


public class onetoNbacktracking {
    public static void nums(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        nums(i-1,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        nums(n,n);
    }
    
}
