import java.util.*;

public class searchelement {
    public static class Node {
        int data;
        Node next;

        Node(int data1, Node next) {
            this.data = data1;
            this.next = next;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }

    public static Node solu(int[] arr) {
        if (arr.length == 0) return null; // Handle the case for empty array

        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int lengthx(int[] arr) {
        int count = 0;
        Node head = solu(arr);
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static boolean haikya(int[] arr, int a) {
        Node head = solu(arr);
        Node temp = head;
        while (temp != null) {
            if (temp.data == a) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node head = solu(arr);
        Node temp = head;
        System.out.println("Linked List elements:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        System.out.println("The length of the linked list is: " + lengthx(arr));

        System.out.println("Enter the element to search:");
        int a = sc.nextInt();
        boolean found = haikya(arr, a);
        if (found) {
            System.out.println("Element " + a + " is present in the linked list.");
        } else {
            System.out.println("Element " + a + " is not present in the linked list.");
        }
    }
}
