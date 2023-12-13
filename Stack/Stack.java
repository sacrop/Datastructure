public class Stack {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void display(){
        if(Top==null){
            System.out.println("empty stack");
        }
        Node currentNode=Top;
        while(currentNode!=null){
            System.out.println(" "+currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }
    public void push(int data){
        Node newNode=new Node(data);
        if(Top==null){
            Top=newNode;
        }
        else{
            newNode.next=Top;
            Top=newNode;
        }
    }
    public void pop(){
        if(Top==null){
            System.out.println("stack is empty");
        }else{
            Top=Top.next;
        }
        
    }
    public Node Top;
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(80);
        stack.display();
        stack.pop();
        stack.display();
    }
}