public class RecursionLinkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public Node head;
    public Node tail;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            tail.next=newNode;
        }
        tail=newNode;
    }
    public void display(Node head){
        if(head==null)return;
        System.out.print("-> "+head.data);
        if(head.next==null)return;
        display(head.next);

    }


    public void insertAfter(int data,int value){
        if(head==null)return;
        Node newNode=new Node(value);
        Node temp=head;
        while(temp!=null){
            if(temp.data==data&&temp.next!=null){
                Node curr=temp.next;
                temp.next=newNode;
                newNode.next=curr;
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        RecursionLinkedlist list=new RecursionLinkedlist();
        list.addNode(10);
        list.addNode(20);
        list.addNode(20);
        list.addNode(20);
        list.addNode(20);
        list.addNode(40);
        list.addNode(60);
        list.display(list.head);
        System.out.println();
        list.insertAfter(20, 100);
        list.display(list.head);
        

    }
}
