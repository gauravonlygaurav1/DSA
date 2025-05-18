public class LengthofLL {
    public static void main(String[] args) {
        int arr[]={2,5,6,8};

        Node head=new Node(arr[0]);
        Node temp=head;

        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }

        int count=0;
        Node current=head;
        while(current != null){
            count++;
            current=current.next;
        }
        System.out.println(count);
    }
}
