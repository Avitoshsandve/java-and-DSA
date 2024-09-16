import java.util.*;
public class convertdecimaltobinary{
    public static String bicon(int n){
        String s="";
        while(n>0){
            if(n%2==1){
                s=s+'1';
            }
            else{
                s=s+'0';
            }
            n=n/2;
        }
        StringBuilder sb=new StringBuilder(s);
        s=sb.reverse().toString();
        return s;
    }
    public static void main(String[] args){
        System.out.println("Decimal to Binary conversion");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n=sc.nextInt();
        String bico=bicon(n);
        System.out.println("The binary number is: "+bico);
        

    }

}