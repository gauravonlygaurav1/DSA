/* Brute Force Approach */
import java.util.HashMap;

public class StartNodeLoop1 {
    public static Node firstNode(Node head){
        
        HashMap<Node, Integer> mpp=new HashMap<>();
        Node temp=head;

        while(temp != null)
        {
            if(mpp.containsKey(temp)){
                return temp;
            }
            else{
                mpp.put(temp,1);
            }
        temp=temp.next;
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
