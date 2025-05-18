/* Brute Force Approach */

import java.util.Stack;
public class Palindrome1 {

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static boolean checkPalindrome(Node head){
        Stack<Integer> st=new Stack<>();
        Node temp=head;

        while(temp != null){
            st.push(temp.data);
            temp=temp.next;
        }

        temp=head;
        while(temp != null)
        {
            if(temp.data != st.pop()) return false;
            temp=temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(1);

        print(head);

        System.out.println();
        boolean ans=checkPalindrome(head);
        System.out.println(ans);
    }
}
