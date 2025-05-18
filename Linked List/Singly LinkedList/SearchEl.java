public class SearchEl {

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

    public static int search(Node head, int target){
        int position = 1;
        Node current = head;

        while(current != null){
            if(current.data==target){
                return position;
            }
            current=current.next;
            position++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,8};
        Node head = convertArr(arr);
        int El =search(head, 8);
        System.out.println(El);
        
    }
}
