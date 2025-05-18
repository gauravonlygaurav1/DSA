/* Optimal Approach */

public class FindLengthLoop2 {

    public static int find(Node slow, Node fast){

        int cnt=1;
        fast=fast.next;

        while(slow != fast){
            cnt++;
            fast=fast.next;
        }
        
        return cnt;
    }

    public static int findLength(Node head){

        Node slow=head, fast=head;

        while(fast != null && fast.next != null){

            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return find(slow,fast);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
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
        fifth.next=second;

        int ans=findLength(head);

        System.out.println("Length of the Loop is: " +ans);
    }
}
