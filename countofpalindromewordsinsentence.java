import java.util.*;
public class countofpalindromewordsinsentence {
    public static boolean ispalind(String s){
        int n=s.length();
        s=s.toLowerCase();
        for(int i=0;i<n;i++,n--){
            if(s.charAt(i)!=s.charAt(n-1)){
                return false;
            }
        }
        return true;

    }
    public static int numof(String st) {
        st = st.trim(); 
        StringBuilder word = new StringBuilder();
        int count = 0;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch != ' ') { 
                word.append(ch);
            } else {
                if (word.length() > 0 && ispalind(word.toString())) { 
                    count++;
                }
                word.setLength(0); 
            }
        }
        if (word.length() > 0 && ispalind(word.toString())) {
            count++;
        }

        return count;
    


    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the palindromic sentence: ");
        String s = sc.nextLine();
        int palcount=numof(s);
        System.out.println("The number of palindromic words in the sentence are: "+palcount);
        
    };



    
}
