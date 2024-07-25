import java.util.*;
public class SubString {
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
        System.out.println("The substring in given string are");
        System.out.println(s.substring(2));
    }
    
}
