public class ReverseNodeKGroup {

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    static Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead= reverse(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        
        return newHead;
    }

    public static Node findKNode(Node temp, int k){

        k -= 1;

        while(temp != null && k > 0){

            k--;

            temp=temp.next;
        }
        return temp;
    }
    public static Node Kreverse(Node head, int k){

        Node temp=head;

        Node prevLast=null;

        while(temp != null){

            Node kthNode= findKNode(temp, k);

            if(kthNode == null){
                if(prevLast != null){
                    prevLast.next=temp;
                }
                break;
            }
            
            Node nextNode = kthNode.next;

            kthNode.next=null;

            reverse(temp);

            if(temp==head){
                head=kthNode;
            }
            else{
                prevLast.next = kthNode;
            }

            prevLast = temp;
            temp = nextNode;
        }

        return head;
    }

    public static void main(String[] args){
        Node head=new Node(5);
        head.next=new Node(4);
        head.next.next=new Node(3);
        head.next.next.next=new Node(7);
        head.next.next.next.next=new Node(9);
        head.next.next.next.next.next=new Node(2);

        print(head);

        head=Kreverse(head,3);

        System.out.println("Reverse Linked List:");
        print(head);
    }
}
