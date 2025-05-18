/* Optimal Approach */
public class Sort0s1s2s_2 {

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static Node Sort(Node head){
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);

        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;

        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.data==1){
                one.next=temp;
                one=temp;
            }
            else if(temp.data==2){
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        if(oneHead.next != null){
            zero.next=oneHead.next;
        }
        else{
            zero.next=twoHead.next;
        }
        one.next=twoHead.next;
        two.next=null;

        Node newHead=zeroHead.next;

        return newHead;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(0);
        head.next.next=new Node(1);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(0);
        head.next.next.next.next.next=new Node(2);
        print(head);

        /* Odd & Even LinkedList */
        System.out.println();
        head=Sort(head);
        print(head);
    }
}
