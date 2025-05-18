/* Optimal Approach */
/* For Odd No. Nodes */
public class DeleteMiddleNode2 {

    public static void print(Node head){
        
        while(head != null){
        System.out.print(head.data +" ");
        head=head.next;
        }
    }

    public static Node deleteMiddle(Node head){
        Node slow=head, fast=head;
        fast=fast.next.next;

        if(head == null || head.next == null){
            return head;
        }

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        print(head);

        System.out.println();
        head=deleteMiddle(head);
        print(head);
    }
}
