import java.util.*;
public class anagramstring {
    public static boolean anagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        int [] charcount=new int[26];
        for(int i=0;i<a.length();i++){
            charcount[a.charAt(i)-'a']++;
            charcount[b.charAt(i)-'a']--;
        }
        for(int count:charcount){
            if(count!=0){
                return false;
            }


        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String");
        String a=sc.nextLine();
        System.out.println("Enter second string");
        String b=sc.nextLine();
        if(anagram(a,b)){
            System.out.println("Theya re anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }
        
    }

    
}
