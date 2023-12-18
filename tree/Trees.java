import java.util.Scanner;

public class Trees{
    private class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value; 
            left=right=null;
        }
    }
    private Node root;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

    }

    public  void populate(Scanner scanner){
        System.out.println("enter the root node value");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner,Node node){
        System.out.println("do you want to enter left of "+node.value+" ");
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter the value of left of "+node.value+" ");
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("do you want to enter right of "+node.value );
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("enter the value to right of "+node.value+"" );
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }
}