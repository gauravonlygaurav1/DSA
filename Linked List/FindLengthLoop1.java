/* Brute Force Approach */
import java.util.HashMap;

public class FindLengthLoop1{

    public static int findLength(Node head){

        HashMap<Node,Integer> mpp=new HashMap<>();
        Node temp=head;
        int timer=1;

        while(temp != null){
            
            if(mpp.containsKey(temp)){

                int value=mpp.get(temp);
                return (timer-value);
            }
            
            mpp.put(temp,timer);
            timer++;

            temp=temp.next;
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