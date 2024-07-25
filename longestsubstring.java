import java.util.*;
public class longestsubstring {
    public static String longest(String s){
        int maxsubsti=0;
        int n=s.length();
        String loong=" ";
        for(int i=0;i<n;i++){
            Set<Character> len=new HashSet<>();
            StringBuilder currentstr=new StringBuilder();
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                if(len.contains(c)){
                    break;
                }
                len.add(c);
                currentstr.append(c);
                
            }
            if(currentstr.length()>maxsubsti){
                maxsubsti=currentstr.length();
                loong=currentstr.toString();

            }
        }
        return loong;
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
        String currentstr=longest(s);
        System.out.println("Longest Substring");
        System.out.println(currentstr);
    
}
}
