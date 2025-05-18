public class Palindrome2 {

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead=reverse(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;

        return newHead;
    }
    public static boolean checkPalindrome(Node head){

        Node slow=head, fast=head;

        while(fast.next != null && fast.next.next==null){
            
            slow=slow.next;
            fast=fast.next.next;
        }

        Node newHead=reverse(slow.next);

        Node first=head;
        Node second=newHead;

        while(second != null && first != slow.next ){
            
            if(first.data != second.data)
            {
                reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newHead);
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