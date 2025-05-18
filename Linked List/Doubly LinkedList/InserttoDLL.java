public class InserttoDLL {

    /* Convert Array to LinkeList */
    public static Node1 convertArr(int[] arr){
        Node1 head=new Node1(arr[0]);

        Node1 prev=head;
        for(int i=1; i<arr.length; i++){
            Node1 temp=new Node1(arr[i], null, prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    } 
    /* Print the LinkedList */
    public static void print(Node1 head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    /* Insert the element at head */
    public static Node1 insertHead(Node1 head, int val){
        Node1 newHead=new Node1(val, head, null);
        head.back=newHead;
        head=newHead;

        return head; 
    }

    /* Insert the element at tail */
    public static Node1 insertTail(Node1 head, int val){
        if(head.next==null){
            return insertHead(head, val);
        }

        Node1 tail=head;
        while(tail.next != null){
            tail=tail.next;
        }
        Node1 prev=tail.back;
        Node1 newNode=new Node1(val, tail, prev);
        prev.next=newNode;
        tail.back=newNode;
        return head;
    }

    /* Insert the element at Kth index */
    public static Node1 insertK(Node1 head, int k, int val){
        if(k==1){
            return insertHead(head, val);
        }
        Node1 temp=head;
        int cnt=0;
        while(temp != null){
            cnt++;
            if(cnt==k) break;
            temp=temp.next;
        }
        Node1 prev=temp.back;
        Node1 newNode=new Node1(val, temp, prev);
        prev.next=newNode;
        temp.back=newNode;
        return head;
    }

    /* Insert the Node at DLL */
    public static void insertBeforeNode(Node1 temp, int val){
        Node1 prev=temp.back;
        Node1 newNode=new Node1(val, temp, prev);
        prev.next=newNode;
        temp.back=newNode;
    }
    public static void main(String[] args){
        int arr[]={2,4,8,10};
        Node1 head=convertArr(arr);
        head=insertHead(head,100); //Insert at head
        head=insertTail(head, 30); //Insert at tail
        head=insertK(head,2,55); //Insert at Kth index
        insertBeforeNode(head.next.next.next,70); //Insert the Node
        print(head);
    }
}
