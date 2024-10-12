import java.util.*;
public class specialfibo {
    public static int fibospe(int n){
        if(n==1){
            return 1;

        }
        if(n==0){
            return 1;
        }
            int prev1=1;
            int prev=1;
            int curr=0;
            for(int i=2;i<=n;i++){
                curr=(prev1*prev1+prev*prev)%47;
                prev1=prev;
                prev=curr;
            }
        
        return curr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int result=fibospe(n);
        System.out.println("The "+n+"th special fibo number is "+result);
    }
}
