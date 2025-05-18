import java.util.ArrayList;
import java.util.Collections;;
public class SortList1 {
    public static void print(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static Node sort1(Node head){
        ArrayList<Integer> arr=new ArrayList<>();
        Node temp=head;
        
        while(temp != null){
            
            arr.add(temp.data);
            temp=temp.next;
        }

        Collections.sort(arr);
        temp=head;
        int i=0;

        while(temp != null)
        {
            temp.data = arr.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(2);
        head.next.next=new Node(4);
        head.next.next.next=new Node(1);

        print(head);

        System.out.println();
        head=sort1(head);
        print(head);
    }
}
