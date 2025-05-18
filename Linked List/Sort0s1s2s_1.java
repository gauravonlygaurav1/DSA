/* Brute Approach */
public class Sort0s1s2s_1{

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
    }

    public static Node Sort(Node head){
        Node temp=head;
        int cnt0=0, cnt1=0, cnt2=0;

        while(temp!=null){
            if(temp.data==0) cnt0++;
            else if(temp.data==1) cnt1++;
            else if(temp.data==2) cnt2++;
            temp=temp.next;
        }
        
        temp=head;
        while(temp!=null){
            if(cnt0 != 0){
                temp.data=0;
                cnt0--;
            }
            else if(cnt1 != 0){
                temp.data=1;
                cnt1--;
            }
            else if(cnt2 != 0){
                temp.data=2;
                cnt2--;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(0);
        head.next.next=new Node(1);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(0);
        head.next.next.next.next.next=new Node(2);
        print(head);

        /* Odd & Even LinkedList */
        System.out.println();
        head=Sort(head);
        print(head);
    }
}
