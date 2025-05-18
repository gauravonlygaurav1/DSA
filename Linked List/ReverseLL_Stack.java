import java.util.Stack;
public class ReverseLL_Stack {

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
    }

    /* Reverse the LinkedList using Iterative Approach */
    public static Node reverse(Node head){
        Node temp=head;

        Stack<Integer> st=new Stack<>();

        // Put the values of LL onto the stack
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }

        //Reset the temp pointer again to the head
        temp=head;
        //Pop values from the stack and update on the linkedlist
        while(temp!=null){
            temp.data=st.pop();
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        //Print the original LinkedList
        System.out.println("Original LinkedList: ");
        print(head);

        //Reverse the LinkedList
        System.out.println();
        head=reverse(head);

        System.out.println("Reverse LinkedList: ");
        print(head);
    }
}
