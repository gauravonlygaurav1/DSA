/* Floyd's Tortoise and Hare Algorithm */

public class MiddleOfLL2 {

    public static Node middleNode(Node head){
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head=new Node(22);
        head.next=new Node(10);
        head.next.next=new Node(80);
        head.next.next.next=new Node(13);
        head.next.next.next.next=new Node(21);
        head.next.next.next.next.next=new Node(90);

        Node mid=middleNode(head);

        System.out.println("The middle value is: " +mid.data);
    }
}
