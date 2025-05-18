public class DeletetoDLL {

    /* Convert Array To LinkedList */
    public static Node1 convertArr(int[] arr){
        Node1 head=new Node1(arr[0]);
        Node1 prev=head;
        for(int i=1; i<arr.length; i++){
            Node1 newNode=new Node1(arr[i],null,prev);
            prev.next=newNode;
            prev=newNode;
        }
        return head;
    }

    /* Print the linkedlist */
    public static void print(Node1 head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
    
    /* Delete head of the DLL */
    public static Node1 removesHead(Node1 head){
        if(head==null || head.next==null){
            return null;
        }

        Node1 prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;

        return head;
    }

    /* Delete tail of the DLL */
    public static Node1 removesTail(Node1 head){
        if(head==null || head.next==null){
            return null;
        }

        Node1 tail=head;

        while(tail.next != null){
            tail=tail.next;
        }

        Node1 newTail=tail.back;
        newTail.next=null;
        tail.back=null;

        return head;
    }

    /* Delete Kth index element of DLL */
    public static Node1 removesK(Node1 head, int k){
        if(head==null){
            return null;
        }
        int cnt=0;
        Node1 temp=head;
        while(temp.next != null){
            cnt++;
            if(cnt==k) {
                break;
            }
            temp=temp.next;
        }
        Node1 prev=temp.back;
        Node1 front=temp.next;

        if(prev==null && front==null){
            return null;
        }
        else if(prev==null){
            return null;
        }
        else if(front==null){
            return null;
        }

        prev.next=front;
        front.back=prev;

        temp.next=null;
        temp.back=null;

        return head;
    }

    /* Delete the Node of the DLL */
    public static void removesNode(Node1 temp){
        Node1 prev=temp.back;
        Node1 front=temp.next;

        if(front==null){
            prev.next=null;
            temp.back=null;
            return;
        }

        prev.next=front;
        front.back=prev;

        temp.next=temp.back=null;
    }
    public static void main(String args[]){
        int arr[]={2,5,8,10};
        Node1 head=convertArr(arr);
        // head=removesHead(head); //Delete head
        // head=removesTail(head); //Delete tail
        // head=removesK(head,3); //Delete Kth index
        removesNode(head.next.next); //Delete Node
        print(head);
    }
}
