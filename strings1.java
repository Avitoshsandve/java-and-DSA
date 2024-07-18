import java.util.*;
public class strings1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of String");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string");
        String s=sc.nextLine();
        if(s.length()!=n){
            System.out.println("Invalid string");
        }
        System.out.println("Entered string");
        System.out.println(s);
        

        
        
    

        

    }
}