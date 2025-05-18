public class ArraytoDLL{

    public static Node1 convertArray(int arr[]){
        Node1 head=new Node1(arr[0]);
        Node1 prev=head;

        for(int i=1; i<arr.length; i++){
            Node1 temp=new Node1(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    public void print(Node1 head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,8,7};
        Node1 head=convertArray(arr);
        ArraytoDLL obj=new ArraytoDLL();//Create an instance
        obj.print(head);//Call the non-static method using the object
    }
}