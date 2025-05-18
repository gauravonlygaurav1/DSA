public class MergeTwoSortLL {

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static Node mergeTwo(Node head1, Node head2){

        Node dNode=new Node(-1);
        Node temp=dNode;
        Node t1=head1;
        Node t2=head2;

        while( t1 != null && t2 != null){
            
            if(t1.data < t2.data){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t1 != null) temp.next=t1;
        else temp.next=t2;

        return dNode.next;
    }
    public static void main(String[] args) {
        Node head1=new Node(3);
        head1.next=new Node(6);
        
        Node head2=new Node(4);
        head2.next=new Node(5);
        head2.next.next=new Node(9);

        System.out.print("L1: ");
        Node head=head1;
        print(head);

        System.out.println();
        System.out.print("L2: ");
        head=head2;
        print(head);

        System.out.println();
        head=mergeTwo(head1, head2);
        System.out.print("Merging of two sorted LL : ");
        print(head);        
    }
}
