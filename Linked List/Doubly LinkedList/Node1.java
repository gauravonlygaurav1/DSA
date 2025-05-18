class Node1{
    int data;
    Node1 next;
    Node1 back;

    Node1(int data1, Node1 next1, Node1 back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }

    Node1(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
}