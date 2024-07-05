package recursion;
import java.util.*;

public class sumofNumbersfunctional {
    public static int sumn(int n){
        if(n==0){
            return 0;
        }
        return n+sumn(n-1);

    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(sumn(n));
    }
    }
    

