public class DetectLoop2 {

    public static boolean detectLoop(Node head){
        Node slow=head, fast=head;

        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        //create a loop
        fifth.next=third;

        if(detectLoop(head)){
            System.out.println("Loop detected in the Linked List.");
        }
        else{
            System.out.println("No Loop detected in the Linked List.");
        }
    }
}
