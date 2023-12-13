public class Queue {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    private void enque(int data){
        Node newNode=new Node(data);
        if(front==null){
            front=Rear=newNode;
            return;
        }
        Rear.next=newNode;
        Rear=newNode;

    }
    private void deque(){
        if(front==null){
            System.out.println("queue is empty");
            return;
        }
        front=front.next;
        if(front==null){
            Rear=null;
        }
    }
    private void display(){
        if(front==null){
            System.out.println("queue is empty");
        }
        Node currNode=front;
        while(currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }
    private Node front;
    private Node Rear;

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(10);
        queue.enque(110);
        queue.display();
        System.out.println();
        queue.deque();
        queue.display();

    }
}
