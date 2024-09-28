// Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, 
//                     puffs and cool drinks. Consider   the following prices : 

// Rs.100/pizza=A
// Rs.20/puffs=B
// Rs.10/cooldrink=c
// Generate a bill for What Vohra has bought.

// Sample Input 1:

// Enter the no of pizzas bought:10
// Enter the no of puffs bought:12
// Enter the no of cool drinks bought:5
// Sample Output 1:

// Bill Details

// No of pizzas:10
// No of puffs:12
// No of cooldrinks:5
// Total price=1290

// ENJOY THE SHOW!!!
import java.util.*;
public class Bill{
    public static int totalis(int A,int B,int C){
        int total=0;
        int pizza=Math.abs(A)*100;
        int puff=Math.abs(B)*20;
        int cooldrink=Math.abs(C)*10;
        total=pizza+puff+cooldrink;

        System.out.println("Bill details");
        System.out.println("Pizza:"+A);
        System.out.println("puffs"+B);
        System.out.println("Softdrinks"+C);


        
        return total;



    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bill");
        System.out.println("No. of pizza: ");
        int A=sc.nextInt();
        System.out.println("No. of puffs: ");
        int B=sc.nextInt();
        System.out.println("No. of cooldrink: ");
        int C=sc.nextInt();
        int result=totalis(A, B, C);
        System.out.println("The total bill is: "+result);
        System.out.println("Chud gaye guru");

    } 
}
