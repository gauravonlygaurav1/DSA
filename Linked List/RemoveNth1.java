public class RemoveNth1 {

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    /* Remove the Nth Node from the end */
    public static Node RemoveN(Node head, int N){
        int cnt=0;
        Node temp=head;

        while(temp!=null){
            cnt++;
            temp=temp.next;
        }

        if(cnt==N){
            Node newHead=head.next;
            return newHead;
        }

        int res=cnt-N;
        temp=head;

        while(temp!=null){
            res--;
            if(res==0) break;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        print(head);

        /* Odd & Even LinkedList */
        System.out.println();
        head=RemoveN(head,2);
        print(head);
    }
}
