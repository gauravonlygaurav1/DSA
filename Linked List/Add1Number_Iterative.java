public class Add1Number_Iterative {

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static Node reverse(Node head)
    {
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverse(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;

        return newHead;
    }
    public static Node add1(Node head){
        head=reverse(head);
        Node temp=head;
        int carry=1;

        while(temp != null){
            temp.data=temp.data + carry;
            if(temp.data < 10){
                carry=0;
                break;
            }
            else{
                temp.data=0;
                carry=1;
            }
        temp=temp.next;
        }
        if(carry==1){
            Node newNode = new Node(1);
            head=reverse(head);
            newNode.next=head;

            return newNode;
        }
        head=reverse(head);
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(5);
        head.next.next=new Node(9);

        print(head);

        System.out.println();
        head=add1(head);
        print(head);
    }
}
