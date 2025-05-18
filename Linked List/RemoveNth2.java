public class RemoveNth2 {
    public static void print(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
    public static Node RemoveN(Node head, int N){
        Node fast=head;
        Node slow=head;

        for(int i=0; i<N; i++) fast=fast.next;

        if(fast==null) return head.next;

        while(fast.next != null)
        {    
            slow=slow.next;
            fast=fast.next;
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

        /* Odd & Even LinkedList */
        System.out.println();
        head=RemoveN(head,2);
        print(head);
    }
}
