public class DeletetoLL{ 

    /* Convert Array to LinkedList */
    public static Node convertArr(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;

        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
        return head;
    }

    /* Print the LinkedList */
    public static void print(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
    
    /* Delete the head of the LL */
    public static Node removesHead(Node head){
        if(head==null) return null;
        head=head.next;
        return head;
    }

    /* Delete the tail of the LL */
    public static Node removesTail(Node head){

        if(head==null || head.next==null) return null;

        Node temp=head;
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    /* Delete K index element of the LL */
    public static Node removeK(Node head, int k){
        if(head==null) return null;
        
        if(k==1){
            Node temp=head;
            head=temp.next;
            return head;
        }

        int cnt=0;
        Node temp=head;
        Node prev=null;
        while(temp != null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    
    /* Delete element from the LL */
    public static Node removeEl(Node head, int el){
        if(head==null)return head;

        if(head.data == el){
            Node temp=head;
            head=temp.next;
            return head;
        }
        
        Node temp=head;
        Node prev=null;
        while(temp != null){
            if(temp.data == el){
                prev.next=prev.next.next;
                break;
            }
            prev = temp;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr={12,5,6,8,4,15,10};
        Node head = convertArr(arr);
        // head=removesHead(head); //delete head
        // head=removesTail(head); //delete tail
        head=removeK(head,4); //delete k
        // head=removeEl(head,6); //delete value
        print(head);

    }
}