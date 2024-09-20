import java.util.*;
public class swap2numbers {
    public static void swappy(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping n1: "+a+" n2: "+b);


    }
    public static void main(String[] args){
        System.out.println("Swap two numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first element: ");
        int n1=sc.nextInt();
        System.out.println("Enter second element: ");
        int n2=sc.nextInt();
        System.out.println("Before swapping n1: "+n1+" n2: "+n2);
        swappy(n1, n2);

    }

    



    
}
