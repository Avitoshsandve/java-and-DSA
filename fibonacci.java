import java.util.*;
public class fibonacci{
    public static long fibo(int n){
        if(n<=1){
            return n;
        }
        long prev=0,curr=1;
        for(int i=2;i<=n;i++){
            long next=prev+curr;
            prev=curr;
            curr=next;
        }
        return curr;



    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Position of fibo number?");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid");
        }
        else{
            long result=fibo(n);
            System.out.println("The fibo number at "+n+" is: "+result);
        }
    }
    
}
