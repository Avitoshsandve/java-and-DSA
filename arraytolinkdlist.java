import java.util.*;
public class arraytolinkdlist{
    public static class Node{
        int data;
        Node next;

        Node(int data1,Node next1){
            this.data=data1;
            this.next=null;
        }
        Node(int data1)
        {
            this.data=data1;
        }
    }
    public static Node dll(int[] arr)
    {
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++)
        {
           Node temp=new Node(arr[i]);
           mover.next=temp;
           mover=temp;
        }
        return head;
    }
    public static void main(String[] args){
        System.out.println("Enter length of array" );
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println(" Enter Elements of array: ");
        Scanner Sc=new Scanner(System.in);
        for(int i=0; i<n; i++){
            arr[i]=Sc.nextInt();
        }
        Node head=dll(arr);
        System.out.println("Linked List elements: "+head.data);




        
    }

    
    
}