import java.util.Scanner;
public class SLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public Node Head = null;
    public Node Tail = null;
    // adding node 
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
        } else {
            Tail.next = newNode;
        }
        Tail = newNode;
        System.out.println("node added successfully");
    }
    // display node
    public void display() {
        if (Head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = Head;
        while (temp != null) {
            System.out.print("->" + temp.data);
            temp = temp.next;
        }
    }
    // insertion at Begining 
    public void insertAtBegin(int data){
        Node newNode=new Node(data);
        if(Head==null){
            Head=newNode;
        }
        else{
            newNode.next=Head;
            Head=newNode;
        }
    }
    // delete node at begin 
    public void deleteAtFirst(){
        if(Head==null){
            System.out.println("list is empty");
            return;
        }
        Head=Head.next;
    }
    //delete node at last
    public void deleteAtEnd(){
        if(Head==null){
            System.out.println("list is empty");
            return;
        }
        if(Head.next==null){
            Head=null;
            return;
        }
        Node currentNode=Head;
        Node nextNode=Head.next;
        while(nextNode.next!=null){
            nextNode=nextNode.next;
            currentNode=currentNode.next;
        }
        currentNode.next=null;
        System.out.println("node deleted successfully");
    }

    public void insertBefore(int data,int value){
        Node newNode=new Node(value);
        Node temp=Head;
        if(temp==null){
            System.out.println("no element found");
            return;
        }
        while(temp.next!=null){
            if(temp.next.data==data){
                Node post=temp.next;
                temp.next=newNode;
            }
        }  
    }

    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();
        Scanner sc = new Scanner(System.in);
        int value, choice;
        
           
            System.out.println(1 +" "+ "add node");
            System.out.println(2 +" "+ "display");
            System.out.println(3 +" "+ "exit");
            System.out.println(4 +" "+ "Insert at Begining");
            System.out.println(5 +" "+ "Delete at end");
        do {
            System.out.println();
            System.out.println("enter one choice:");
            // System.out.println(3 +" "+ "exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter the value to be inserted :");
                    value = sc.nextInt();
                    list.addNode(value);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                System.out.println("----------exiting code--------");
                break;
                
                case 4:
                System.out.print("enter the value to be inserted :");
                value = sc.nextInt();
                list.insertAtBegin(value);
                break;

                case 5:
                list.deleteAtEnd();
                break;

                default:System.out.println("wrong choice");
                    break;
            }

        } while (choice != 3);
        sc.close();

    }
}
