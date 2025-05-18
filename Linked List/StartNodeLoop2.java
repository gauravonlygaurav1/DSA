/* Optimal Approach */

public class StartNodeLoop2 {

    public static Node firstNode(Node head){
        
        Node slow=head, fast=head;

        while(fast != null && fast.next != null){
            
            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast)
            {
                slow=head;
                while(slow != fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;//--> It's the Starting Point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2=new Node(2);
        node1.next=node2;
        Node node3=new Node(3);
        node2.next=node3;
        Node node4=new Node(4);
        node3.next=node4;
        Node node5=new Node(5);
        node4.next=node5;

        //Make a Loop
        node5.next=node2;

        //set the head of LL
        Node head=node1;

        Node loopStart = firstNode(head);

        if(loopStart != null){
            System.out.println("Loop detected. Starting node of the Loop is: " +loopStart.data);
        }
        else{
            System.out.println("No Loop detected in the Linked List");
        }
    }
}
