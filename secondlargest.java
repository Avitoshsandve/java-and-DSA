import java.util.Scanner;

public class secondlargest {
     public static void main(String[] args){
        System.out.println("Enter length of array" );
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] age=new int[n];
        System.out.println(" Enter Elements of array: ");
        Scanner Sc=new Scanner(System.in);
        for(int i=0; i<n; i++){
            age[i]=Sc.nextInt();
        }
        int max=age[0];
        for(int i=0;i<n;i++){
            if(age[i]>max){
                max=age[i];
            }

        }
        System.out.println("Largest number in the array is: "+max);

        int secondmax=age[0];
        for(int i=0;i<n;i++){
            if(age[i]>secondmax && age[i]!=max){
                secondmax=age[i];
            }
        }
        System.out.println("Second Largest number in the array is: "+secondmax);

}
}
    
