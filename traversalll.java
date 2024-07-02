import java.util.*;
public class traversalll{
    public static class Node{
        int data;
        Node next;

        Node(int data1,Node next){
            this.data=data1;
            this.next=null;

        }
        Node(int data1){
            this.data=data1;
        }

    }
    public static Node solu(int[] arr)
    {
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=0;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            mover=temp;
        }
        return head;
    }
    public static int lengthx(int[] arr)
    {
        int count=0;
        Node head=solu(arr);
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;


    }
    public static void main(String[] args){
        System.out.println("Enter length of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Entet elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Node head=solu(arr);
        Node temp=head;
        while(head!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;



        }
        System.out.println("The length of LL is:"+lengthx(arr));

    }
    

}