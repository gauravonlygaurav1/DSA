public class ReverseLL_Iterative {

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
    }

    public static Node reverse(Node head){
        Node temp=head;
        Node prev=null;

        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        System.out.println("Original LinkedList: ");
        print(head);

        System.out.println();
        head=reverse(head);
        
        System.out.println("Reverse LinkedList: ");
        print(head);
    }
}
