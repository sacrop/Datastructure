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
    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();
        Scanner sc = new Scanner(System.in);
        int value, choice;
        do {
            System.out.println("enter one choice:");
            System.out.println(1 +" "+ "add node");
            System.out.println(2 +" "+ "display");
            System.out.println(3 +" "+ "exit");
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

                default:
                    break;
            }

        } while (choice != 3);
        sc.close();

    }
}
