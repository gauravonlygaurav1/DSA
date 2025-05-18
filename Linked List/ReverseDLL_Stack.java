import java.util.Stack;
public class ReverseDLL_Stack {

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
        Stack<Integer> st=new Stack<>();
        Node1 temp=head;
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=st.pop();
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node1 head=convertArray(arr);
        head=reverseDLL(head);
        print(head);
    }
}
