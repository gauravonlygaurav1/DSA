/* Brute Force Approach */
/* For Even No. Nodes */
public class DeleteMiddleNode1 {

    public static void print(Node head){
        
        while(head != null){
        System.out.print(head.data +" ");
        head=head.next;
        }
    }

    public static Node deleteMiddle(Node head){
        Node temp=head;
        int N=0;
        while(temp != null){
            N++;
            temp=temp.next;
        }
        
        int res=N/2;
        temp=head;
        while(temp != null){
            res--;
            if(res==0){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        print(head);

        System.out.println();
        head=deleteMiddle(head);
        print(head);
    }
}
