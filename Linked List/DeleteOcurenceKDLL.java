public class DeleteOcurenceKDLL {

    public static Node1 convertArray(int arr[]){
        Node1 head=new Node1(arr[0]);
        Node1 prev=head;

        for(int i=1; i<arr.length; i++){
            Node1 temp=new Node1(arr[i], null, prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static void print(Node1 head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static Node1 deleteK(Node1 head, int key){

        Node1 temp=head;

        while(temp != null){

            if(temp.data == key)
            {
                if(temp==head){
                    head=head.next;
                }

                Node1 nextNode = temp.next;
                Node1 prevNode = temp.back;

                if(prevNode != null) prevNode.next=nextNode;
                if(nextNode != null) nextNode.back=prevNode;

                temp=nextNode;
            }

            else{
                temp=temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args){
        int arr[]={10, 4, 10, 10, 6, 10};
        Node1 head=convertArray(arr);

        System.out.print("Before Delete the Occurrence of Key: ");
        print(head);

        System.out.println();
        System.out.print("After Delete the Occurrence of Key: ");
        head=deleteK(head, 10);
        print(head);
    }
}
