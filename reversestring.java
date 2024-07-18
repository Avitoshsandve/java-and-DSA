import java.util.*;
public class reversestring {
    public static String reverse(String s){
        Stack<Character> stuck=new Stack<>();
        for(int i=0;i<s.length();i++){
            stuck.push(s.charAt(i));
             
        }
        StringBuilder rev=new  StringBuilder();
        while(!stuck.isEmpty()){
            rev.append(stuck.pop());


        }
        return rev.toString();


        
    }
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
        String rev=reverse(s);
        System.out.println("Reversed String");
        System.out.println(rev);
    }

    
}
