public class RemovDuplicateSortDLL {

    public static Node1 convertArray(int arr[]){
        Node1 head = new Node1(arr[0]);
        Node1 prev=head;

        for(int i=1; i<arr.length; i++){
            Node1 newNode = new Node1(arr[i], null, prev);
            prev.next=newNode;
            prev=newNode;
        }
        return head;
    }

    static void print(Node1 head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static Node1 removeDup(Node1 head){
        Node1 temp = head;
        
        while(temp != null && temp.next != null)
        {
            Node1 nextNode=temp.next;

            while(nextNode != null && nextNode.data == temp.data)
            {
                nextNode = nextNode.next;
            }

            temp.next = nextNode;
            if(nextNode != null) nextNode.back=temp;

            temp=temp.next;
        }
        return head;
    }


    public static void main(String[] args) {
        int arr[]={1, 1, 1, 2, 3, 3, 4};
        Node1 head = convertArray(arr);

        System.out.print("Original Doubly LinkedList: ");
        print(head);

        System.out.println();
        System.out.print("After the Duplicates Removing: ");
        head=removeDup(head);
        print(head);
    }
}
