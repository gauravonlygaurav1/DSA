public class SortList2 {

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static Node mergeTwoSortedLL(Node list1, Node list2){

        Node dummyNode= new Node(-1);
        Node temp = dummyNode;

        while(list1 != null && list2 != null){
            if(list1.data<=list2.data){
                temp.next=list1;
                temp=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                temp=list2;
                list2=list2.next;
            }

        }
        if(list1 != null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }

        return dummyNode.next;
    }
    public static Node findMiddle(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node slow=head;
        Node fast=head;

        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node sortLL(Node head){
        
        if(head==null || head.next==null){
            return head;
        }

        Node middle = findMiddle(head);

        Node right = middle.next;
        middle.next = null;
        Node left = head;

        //Recursively sort the left and right halves
        left = sortLL(left);
        right = sortLL(right);

        return mergeTwoSortedLL(left, right);
    }

    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(2);
        head.next.next=new Node(4);
        head.next.next.next=new Node(1);

        print(head);

        System.out.println();
        head=sortLL(head);
        print(head);
    }
}
