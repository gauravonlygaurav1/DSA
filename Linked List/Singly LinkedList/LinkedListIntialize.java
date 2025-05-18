
class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}

public class LinkedListIntialize{

    public static void main(String[] args){
        int[] arr={2,5,6,8};
        /* For Single Value get in LL */

        // Node y = new Node(arr[1]);
        // System.out.println(y.data);

        /* For Chain Value gets in LL */

        Node third=new Node(arr[2], null);
        Node second=new Node(arr[1], third);
        Node first=new Node(arr[0], second);

        Node current=first;
        while(current!=null){
            System.out.print(current.data +" ");
            current=current.next;
        }
    }
}