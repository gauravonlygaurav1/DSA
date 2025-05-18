/* Optimal Approach */
public class OddEvenLL2 {

    public static void print(Node head){
       while(head!=null){
        System.out.print(head.data + " ");
        head=head.next;
        }
    }

    public static Node OddEven(Node head){
        
        if(head==null || head.next==null) return head;

        Node odd=head;
        Node even=head.next;
        Node evenHead=head.next;

        while(even != null && even.next != null){
            
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;
            
        }
        odd.next=evenHead;
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
