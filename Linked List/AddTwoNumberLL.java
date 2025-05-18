public class AddTwoNumberLL {

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static Node SumTwo(Node head1, Node head2){
        Node t1=head1, t2=head2;
        Node dummyNode=new Node(-1);
        Node curr=dummyNode;
        int carry=0;

        while(t1 != null || t2 != null){
            int sum=carry;
            if(t1 != null){ 
                sum=sum+t1.data;
                t1=t1.next;
            }
            if(t2 != null){
                sum=sum+t2.data; 
                t2=t2.next;
            }

            Node newNode=new Node(sum%10);
            carry=sum/10;
            
            curr.next=newNode;
            curr=curr.next;
        }
        if(carry != 0){
            Node newNode=new Node(carry);
            curr.next=newNode;
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {
        Node head1=new Node(3);
        head1.next=new Node(5);
        
        Node head2=new Node(4);
        head2.next=new Node(5);
        head2.next.next=new Node(9);
        head2.next.next.next=new Node(9);

        System.out.print("L1: ");
        Node head=head1;
        print(head);

        System.out.println();
        System.out.print("L2: ");
        head=head2;
        print(head);

        System.out.println();
        head=SumTwo(head1, head2);
        System.out.print("Sum: ");
        print(head);        
    }
}
