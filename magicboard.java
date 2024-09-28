// Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
// For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
// [Assume the number of inputs should be always 4 ]

// Sample Input 1:

// Enter the digits:
// 65
// 66
// 67
// 68
// Sample Output 1:

// 65-A
// 66-B
// 67-C
// 68-D

import java.util.*;

public class magicboard {
    public static void jadu(int A, int B, int C, int D) {
        char r = (char) A;
        char t = (char) B;
        char y = (char) C;
        char u = (char) D;

        System.out.println(A + "-" + r);
        System.out.println(B + "-" + t);
        System.out.println(C + "-" + y);
        System.out.println(D + "-" + u);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number: ");
        int A = sc.nextInt();
        System.out.println("Second number: ");
        int B = sc.nextInt();
        System.out.println("Third number: ");
        int C = sc.nextInt();
        System.out.println("Fourth number: ");
        int D = sc.nextInt();
        jadu(A, B, C, D);

    }

}
