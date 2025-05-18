public class InsertToLL{

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

/* Insert element in head of the LL */
public static Node insertHead(Node head, int val){
    return new Node(val,head);
}

/* Insert element at tail of the LL */
public static Node insertTail(Node head, int val){
    if(head==null){
        return new Node(val);
    }
    Node temp=head;
    while(temp.next != null){
        temp=temp.next;
    }
    Node newNode=new Node(val);
    temp.next=newNode;
    return head;
}

/* Insert element at Kth index of the LL */
public static Node insertK(Node head, int el, int k){
    if(head==null){
        if(k==1) return new Node(el);
        else return null;
    }
    if(k==1){
        Node temp=new Node(el,head);
        return temp;
    }

    int cnt=0;
    Node temp=head;

    while(temp != null){
        cnt++;
        if(cnt==(k-1)){
            Node x=new Node(el);
            x.next=temp.next;
            temp.next=x;
            break;
        }
        temp=temp.next;
    }
    return head;
}

/* Insert Element before the value */
public static Node insertBeforeValue(Node head, int el, int val){

    if(head==null){
        return null;
    }
    if(head.data==val){
        return new Node(el,head);
    }

    Node temp=head;
    
    while(temp.next != null){

        if(temp.next.data==val){
            Node x=new Node(el);
            x.next=temp.next;
            temp.next=x;
            break;
        }
        temp=temp.next;
    }
    return head;
}

    public static void main(String[] args) {
        int arr[]={12,3,8,10};
        Node head=convertArr(arr);
        head=insertHead(head,100);// Insert at head
        head=insertTail(head,50);// Insert at tail
        head=insertK(head,66,3);// Insert at Kt index
        head=insertBeforeValue(head, 55,8);// Insert at 8 value
        print(head);
    }
}

