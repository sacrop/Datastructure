public class DlinkedList {
     class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public Node head;
    public Node tail;

    // methods 
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
    }
    public void display(){
        if(head==null)return;
        Node temp=head;
        while(temp!=null){
            System.out.print(" -> "+temp.data);
            temp=temp.next;
        }
    }

    public void reverseDisplay(){
        if(head==null)return;
        Node temp=tail;
        while(temp!=null){
            System.out.print("-> "+temp.data);
            temp=temp.prev;
        }
    }
    public static void main(String[] args) {
        DlinkedList dlist=new DlinkedList();
        dlist.add(10);
        dlist.add(20);
        dlist.add(40);
        dlist.add(1);
        dlist.add(100);
        dlist.display();
        System.out.println();
        dlist.reverseDisplay();
    }
}
