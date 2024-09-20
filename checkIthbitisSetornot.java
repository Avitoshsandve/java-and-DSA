import java.util.*;
public class checkIthbitisSetornot{
    public static boolean isset(int n,int i){
        return((n&(1<<i)))!=0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element: ");
        int n=sc.nextInt();
        System.out.println("Enter the position to check the set: ");
        int i=sc.nextInt();
        if(isset(n, i)){
            System.out.println("The "+i+"th bit is set");
        }
        else{
            System.out.println("The "+i+"th bit is not set");
        }
    }
}