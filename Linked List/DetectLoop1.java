/* Brute Force Approach */

import java.util.HashMap;
public class DetectLoop1 {

    public static boolean detectLoop(Node head){

        Node temp=head;

        HashMap<Node, Integer> nodeMap=new HashMap<>();

        while(temp != null){

            if(nodeMap.containsKey(temp)){
                return true;
            }
            //Store the current node in the map
            nodeMap.put(temp, 1);

            temp=temp.next;
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
