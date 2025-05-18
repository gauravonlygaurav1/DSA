public class Add1Number_Recursive {

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static int helper(Node temp){
        
        if(temp == null){
            return 1;
        }
        int carry = helper(temp.next);

        temp.data=temp.data+carry;

        if(temp.data < 10){
            return 0;
        }
        
        temp.data=0;
        return 1;
    }
    public static Node add1(Node head){
        int carry=helper(head);
        if(carry==1){
            Node newNode=new Node(1);
            newNode.next=head;
            return newNode; 
        }
        return head;
    }
    
    public static void main(String[] args) {
        Node head=new Node(9);
        head.next=new Node(9);
        head.next.next=new Node(9);
        head.next.next.next=new Node(9);
        
        print(head);

        System.out.println();
        head=add1(head);
        print(head);
    }
}
