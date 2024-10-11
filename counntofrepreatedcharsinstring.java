import java.util.*;
public class counntofrepreatedcharsinstring {
    public static int cocount(String s,int k){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==k){
                count++;
            }


        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        System.out.println("Enter the character you want count of: ");
        char k=sc.next().charAt(0);
        int result=cocount(s,k);
        System.out.println("The counnt of character "+k+" in string is: "+result);
    }
    
}
