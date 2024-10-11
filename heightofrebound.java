import java.util.Scanner;

public class heightofrebound {
    public static int ball(int height, int u, int v) {
        
        double e = (double) u / v;
        double a=Math.pow(e,e);

        double reboundHeight = height * Math.pow(e, 2 * e);

        return (int) reboundHeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial height: ");
        int height = sc.nextInt();

        System.out.println("Enter initial velocity: ");
        int u = sc.nextInt();

        System.out.println("Enter final velocity: ");
        int v = sc.nextInt();
        int result = ball(height, u, v);

      
        System.out.println("The height of the rebound after " + (u/v) + " bounces is: " + result);
    }
}
