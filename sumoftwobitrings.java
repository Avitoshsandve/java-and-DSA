import java.util.*;
public class sumoftwobitrings {
    public static String bistrings(String s,String t){
        int i=s.length()-1;
        int j=t.length()-1;
        int temp=0;
        StringBuilder added=new StringBuilder();
        while(i>=0 || j>=0 || temp==1){
            int addi=temp;
            if(i>=0){
                addi=addi+s.charAt(i--)-'0';

            }
            if(j>=0){
                addi=addi+t.charAt(j--)-'0';
            }
            added.append(addi%2);
            temp=addi/2;
        }
        return added.reverse().toString();


    }
    
}
