/* Brute Force Approach */
import java.util.ArrayList;
public class OddEvenLL1{

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " " );
            head=head.next;
        }
    }

    public static Node OddEven(Node head){
        ArrayList<Integer> arr=new ArrayList<>();
        
        /* For Odd */
        Node temp=head;
        while(temp != null && temp.next != null){
            arr.add(temp.data);
            temp=temp.next.next;
        }
        if(temp != null) arr.add(temp.data);

        /* For Even */
        temp=head.next;
        while(temp != null && temp.next != null){
            arr.add(temp.data);
            temp=temp.next.next;
        }
        if(temp != null) arr.add(temp.data);

        int i=0;
        temp=head;
        while(temp != null){
            temp.data=arr.get(i);
            i++;
            temp=temp.next;
        }
        return head;    
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        print(head);

        /* Odd & Even LinkedList */
        System.out.println();
        head=OddEven(head);
        print(head);

    }
}