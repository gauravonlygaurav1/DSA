public class ArraytoLL {
    public static void main(String[] args) {
        int[] arr={2,5,6,8};

        Node head=new Node(arr[0]);
        Node temp=head;

        for(int i=1;i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode; //Link current node to the new node
            temp = temp.next;
        }

        //Print the Linked List by traversing in LL
        Node current = head;
        while(current != null){
            System.out.print(current.data +" ");
            current=current.next;
        }
    }
}
