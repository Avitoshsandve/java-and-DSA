
// Problem Statement – FOE college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

// Note : If any input is negative, the output should be “Input is Invalid”.  If all department has equal number of placements, the output should be “None of the department has got the highest placement”.

// Sample Input 1:

// Enter the no of students placed in CSE:90
// Enter the no of students placed in ECE:45
// Enter the no of students placed in MECH:70
// Sample Output 1:

// Highest placement
// CSE

// Sample Input 2:

// Enter the no of students placed in CSE:55
// Enter the no of students placed in ECE:85
// Enter the no of students placed in MECH:85
// Sample Output 2:

// Highest placement
// ECE

// MECH

// Sample Input 3:

// Enter the no of students placed in CSE:0
// Enter the no of students placed in ECE:0
// Enter the no of students placed in MECH:0
// Sample Output 3:

// None of the department has got the highest placement
// Sample Input 4:

// Enter the no of students placed in CSE:10
// Enter the no of students placed in ECE:-50
// Enter the no of students placed in MECH:40
// Sample Output 4:

// Input is Invalid

import java.util.Scanner;

public class placement {
    public static void highplace(int A,int B,int C){
        if(A<0||B<0||C<0){
            System.out.println("Invalid");

        }
        else{
            if(A==B&& B==C && C==A){
                System.out.println("Sab ek jaise hai");
            }
            else if(A==B && A>C){
                System.out.println("Both A and B got highest placement");

            }
            else if(A==C && A>B){
                System.out.println("Both A and C got highest placement");

            }
            else if(B==C && B>A){
                System.out.println("Both B and C got highest placement");
            }
            else if(A>B && A>C){
                System.out.println("A got highest placement");
            }
            else if(B>A && B>C){
                System.out.println("B got highest placement");
            }
            else{
                System.out.println("C got hghest placement");
            }
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Placement in A: ");
        int A=sc.nextInt();
        System.out.println("PLacmeents in B: ");
        int B=sc.nextInt();
        System.out.println("placements in C: ");
        int C=sc.nextInt();
        highplace(A, B, C);
    }

    
}
