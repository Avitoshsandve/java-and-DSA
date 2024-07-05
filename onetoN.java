package recursion;
import java.util.*;

public class onetoN {
    public static void nums(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        nums(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        nums(1,n);

    }
    
}
