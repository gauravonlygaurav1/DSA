public class MiddleOfLL1{

    public static Node middleNode(Node head){
        Node temp=head;
        int cnt=0;

        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int midNode=(cnt/2)+1;
        temp=head;

        while(temp!=null){
            midNode=midNode-1;
            if(midNode==0) break;
            temp=temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node head=new Node(22);
        head.next=new Node(10);
        head.next.next=new Node(80);
        head.next.next.next=new Node(13);
        head.next.next.next.next=new Node(21);
        head.next.next.next.next.next=new Node(80);

        Node mid=middleNode(head);

        System.out.println("The middle value is: " +mid.data);


    }
}