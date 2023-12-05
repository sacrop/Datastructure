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
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
        }
    }

    // delete node at begin
    public void deleteAtFirst() {
        if (Head == null) {
            System.out.println("list is empty");
            return;
        }
        Head = Head.next;
    }

    // delete node at last
    public void deleteAtEnd() {
        if (Head == null) {
            System.out.println("list is empty");
            return;
        }
        if (Head.next == null) {
            Head = null;
            return;
        }
        Node currentNode = Head;
        Node nextNode = Head.next;
        while (nextNode.next != null) {
            nextNode = nextNode.next;
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        System.out.println("node deleted successfully");
    }

    // delete after a node 
    public void deleteAfter(int data) {
        if (Head == null || Head.next == null) {
            System.out.println("no items present");
            return;
        }
        Node curr = Head;
        Node forward = Head.next;
        while (forward != null && curr.data != data) {
            curr = curr.next;
            forward = forward.next;
        }
        if (forward != null && curr != null) {
            curr.next = forward.next;
            System.out.println("node deleted successfully");
        } else {
            System.out.println("node is not found");
        }

    }
    // delete node before 
    public void deleteBefore(int data) {
        if (Head == null || Head.next == null) {
            System.out.println("Insufficient items");
            return;
        }
        if (Head.data == data) {
            System.out.println("insufficient");
            return;
        }

        if (Head.next.data == data) {
            Head = Head.next;
            System.out.println("deleted successfully");
            return;
        }

        Node currentNode = Head;
        Node prev = null;

        // Traverse the list until the target node is found
        while (currentNode != null && currentNode.next.data != data) {
            prev = currentNode;
            currentNode = currentNode.next;
        }

        // Check if the target node is found
        if (currentNode != null && prev != null) {
            // Update the next pointer of the previous node to skip the target node
            prev.next = currentNode.next;
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Node with data " + data + " not found or it is the first node");
        }
    }

    // find and replace
    public void findAndReplace(int element, int value) {
        Node temp = Head;
        if (temp == null) {
            System.out.println("list is empty");
            return;
        }
        boolean found = false;
        while (temp != null) {
            if (temp.data == element) {
                temp.data = value;
                found = true;
                return;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Data not found");
        }
    }

    // insertion before an element
    public void insertBefore(int pos, int value) {
        if (Head == null || (Head.data != pos && Head.next == null)) {
            System.out.println("no data found");
            return;
        }
        if (Head.data == pos) {
            Node temp = new Node(value);
            temp.next = Head;
            Head = temp;
            System.out.println("node added succesfully");
            return;
        }
        Node curr = Head;
        Node prev = null;
        while (curr != null && curr.data != pos) {
            prev = curr;
            curr = curr.next;
        }
        if (prev != null && curr != null) {
            Node temp = new Node(value);
            prev.next = temp;
            temp.next = curr;
            System.out.println("node added succesfully");
        }
    }

    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();
        Scanner sc = new Scanner(System.in);
        int value, choice;

        System.out.println(1 + " " + "add node");
        System.out.println(2 + " " + "display");
        System.out.println(3 + " " + "exit");
        System.out.println(4 + " " + "Insert at Begining");
        System.out.println(5 + " " + "Delete at end");
        System.out.println(6 + " " + "Replace ");
        System.out.println(7 + " " + "delete node before data ");
        System.out.println(8 + " " + "insert node before data ");

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

                case 6:
                    System.out.println("enter element and replacing value");
                    int element = sc.nextInt();
                    value = sc.nextInt();
                    list.findAndReplace(element, value);
                    break;

                case 7:
                    System.out.println("delete element before ");
                    value = sc.nextInt();
                    list.deleteBefore(value);
                    break;
                case 8:
                    System.out.println("delete element after");
                    value = sc.nextInt();
                    list.deleteAfter(value);
                    break;

                case 9:
                    System.out.println("insert before");
                    value = sc.nextInt();
                    int data = sc.nextInt();
                    list.insertBefore(value, data);
                    break;
                default:
                    System.out.println("wrong choice");
                    break;
            }

        } while (choice != 3);
        sc.close();

    }
}
