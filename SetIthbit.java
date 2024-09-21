import java.util.*;

public class SetIthbit {
    public static int setbit(int n,int i){
        return n|(1<<i);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the bit value: ");
        int n=sc.nextInt();
        System.out.println("Enter the position to set the bit: ");
        int i=sc.nextInt();
        int result=setbit(n,i);
        System.out.println("After setting the "+i+"th bit,the number is: "+result);
    }
    
}
