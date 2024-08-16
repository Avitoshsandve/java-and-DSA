import java.util.*;
public class fibonacciDp {
    public static long fibo(int n){
        if(n<=1){
            return n;
        }
        long[] dp=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        long prev=0,curr=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];



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
