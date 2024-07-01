import java.util.Scanner;
public class Miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynum=(int)Math.random()*100;
        int num=0;
        do{
            System.out.println("Guess the number");
            num=sc.nextInt();
            if(num>mynum){
                System.out.println("Too high");
            }
            else if(num<mynum){
                System.out.println("Too low");
            }
        }while(num>=0);
        System.out.println("You guessed the number");
    }
}
        
    

