public class ReverseDLL_Iterative {
    public static Node1 convertArray(int[] arr){
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
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
    public static Node1 reverseDLL(Node1 head){

        if(head == null || head.next == null){
            return head;
        }
        Node1 last=null; 
        Node1 current=head;
        while(current != null){
            last=current.back;
            current.back=current.next;
            current.next=last;
            current=current.back;
        }
        return last.back;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node1 head=convertArray(arr);
        head=reverseDLL(head);
        print(head);
    }
}
