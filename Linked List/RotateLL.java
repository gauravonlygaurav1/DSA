public class RotateLL{

    public static void print(Node head){
    
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static Node findLastNode(Node temp, int target){
        int cnt=1;
        while(temp != null){
            if(cnt==target) return temp;
            cnt++;
            temp=temp.next;
        }
        return temp;
    }
    public static Node rotateK(Node head, int K){
        Node temp=head;
        int len=1;

        while(temp.next != null){
            len++;
            temp=temp.next;
        }

        if(K % len == 0) return head;

        K = K % len;

        temp.next = head;

        Node newNode = findLastNode(head, len-K);

        head=newNode.next;
        newNode.next=null;

        return head;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        print(head);
        
        System.out.println();
        System.out.println("After the Rotation");
        
        print(rotateK(head,2));

    }
}